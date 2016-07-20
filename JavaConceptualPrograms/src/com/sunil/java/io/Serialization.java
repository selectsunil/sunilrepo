package com.sunil.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
 
class SerializationBox implements Serializable {
 
  private byte serializableProp = 10;
  private String name;
  private Date date;
 
  public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public String getName() {
	return name;
}
  

public void setName(String name) {
	this.name = name;
}

public byte getSerializableProp() {
    return serializableProp;
  }
  
}
 
public class Serialization {
 
  public static void main(String args[]) throws IOException,
      FileNotFoundException, ClassNotFoundException {
 
    SerializationBox serialB = new SerializationBox();
    serialB.setName("Sunil");
    serialB.setDate(new Date());
    serialize("serial.out", serialB);
    SerializationBox sb = (SerializationBox) deSerialize("serial.out");
    System.out.println(" byte value="+sb.getSerializableProp()+" , name="+sb.getName()+" , Date="+sb.getDate());
  }
 
  public static void serialize(String outFile, Object serializableObject)
      throws IOException {
    FileOutputStream fos = new FileOutputStream(outFile);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(serializableObject);
  }
 
  public static Object deSerialize(String serilizedObject)
      throws FileNotFoundException, IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(serilizedObject);
    ObjectInputStream ois = new ObjectInputStream(fis);
    return ois.readObject();
  }
}
