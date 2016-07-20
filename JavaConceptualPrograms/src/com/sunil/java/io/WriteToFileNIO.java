package com.sunil.java.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFileNIO {

	private static final String FILEPATH = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile.txt";

	public static void main(String[] args) throws IOException {

		String str2 = "aipcipasincinainsovusdvweviasbdoviuabsudviuadv";

		long numBytes = str2.getBytes().length;
		
		// obtain an inputstream from the string
		InputStream inputStream = new ByteArrayInputStream(str2.getBytes(Charset.forName("UTF-8")));
		
		writeWithFileChannerDMA(inputStream,FILEPATH,numBytes);

	}

	/**
	 * Write a small string to a File - Use a FileWriter
	 */
	public static void simpleWrite(String content, String filePath) {
		Path fileP = Paths.get(filePath);
		try {

			Files.write(fileP, content.getBytes("utf-8"));

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Write a string list to a File
	 */
	public static void simpleWriteListOfString(List<String> content,
			String filePath) {
		Path fileP = Paths.get(filePath);
		Charset charset = Charset.forName("utf-8");

		try {

			Files.write(fileP, content, charset);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write a big list of Strings to a file - Use a BufferedWriter
	 */
	public static void bufferedWrite(List<String> content, String filePath) {

		Path fileP = Paths.get(filePath);
		Charset charset = Charset.forName("utf-8");

		try (BufferedWriter writer = Files.newBufferedWriter(fileP, charset)) {

			for (String line : content) {
				writer.write(line, 0, line.length());
				writer.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Write raw data to file - use OutputStream
	 */
	public static void writeWithOutputStream(String content, String filePath) {

		Path fileP = Paths.get(filePath);

		try (OutputStream outputStream = Files.newOutputStream(fileP)) {

			outputStream.write(content.getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Write raw data to file using BufferedOutputStream
	 */
	public static void writeWithBufferedOutputStream(List<String> content,
			String filePath) {

		Path fileP = Paths.get(filePath);

		try (BufferedOutputStream outputStream = new BufferedOutputStream(
				Files.newOutputStream(fileP))) {

			for (String line : content) {
				outputStream.write(line.getBytes());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write to a file using a FileChanel and MappedByteBuffer
	 */
	public static void writeWithRandmoAccessFile(String content, String filePath) {

		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(
				filePath), "rw")) {

			// move the cursor to the end of the file
			// you can move the cursor to any position inside the file to write
			// at random positions
			randomAccessFile.seek(randomAccessFile.length());

			randomAccessFile.write(content.getBytes());

			// alternatively you can use randomAccessFile.writeChars(content)
			// or randomAccessFile.writeUTF(content);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeWithFileChannel(String content, String filePath) {

		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(
				filePath), "rw")) {

			// move the cursor to the end of the file
			randomAccessFile.seek(randomAccessFile.length());

			// obtain the a file channel from the RandomAccessFile
			try (FileChannel fileChannel = randomAccessFile.getChannel()) {

				ByteBuffer buf = ByteBuffer.allocate(512);
				buf.clear();
				buf.put(content.getBytes());

				buf.flip();

				while (buf.hasRemaining()) {
					fileChannel.write(buf);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Write to a file using a FileChanel and MappedByteBuffer
	 */
	public static void writeWithMemMappedBuffer(String content, String filePath) {

		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(
				filePath), "rw")) {

			// move the cursor to the end of the file
			randomAccessFile.seek(randomAccessFile.length());

			// obtain the a file channel from the RandomAccessFile
			try (FileChannel fileChannel = randomAccessFile.getChannel()) {

				// Map a 512 byte region of the file to this memory buffer
				MappedByteBuffer memoryMappedbuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, fileChannel.position(),content.getBytes().length);

				memoryMappedbuffer.put(content.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Write to a file using a FileChanel and DMA
	 */
	public static void writeWithFileChannerDMA(InputStream inputStream, String outputFile, long count) {

		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(
				outputFile), "rw")) {

			// move the cursor to the end of the file
			randomAccessFile.seek(randomAccessFile.length());

			// obtain the a file channel from the RandomAccessFile
			try (
					FileChannel fileChannel = randomAccessFile.getChannel();
					ReadableByteChannel inputChannel = Channels.newChannel(inputStream)	;
					
				) {

				fileChannel.transferFrom(inputChannel, 0, count);
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
