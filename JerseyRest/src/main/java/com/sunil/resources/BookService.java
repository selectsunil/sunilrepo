package com.sunil.resources;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {
	
	private static BigInteger nextVal;
	private static Map<BigInteger,Book> bookMap;
	
	public static Book save(Book book){
		
		if(bookMap == null){
			bookMap = new HashMap<BigInteger,Book>();
			nextVal=BigInteger.ONE;
		}
		
		
		book.setId(nextVal);		
		bookMap.put(nextVal, book);
		nextVal=nextVal.add(BigInteger.ONE);
		return book;	
		
	}
	
	
	public static Book update(Book book){

		Book oldBook = bookMap.get(book.getId());
		if (oldBook == null){
			return null;
		}
		bookMap.remove(book.getId());
		bookMap.put(book.getId(), book);
		return book;

	}
	
	public static Book remove(BigInteger id){

		Book oldBook = bookMap.get(id);
		if (oldBook == null){
			return null;
		}
		bookMap.remove(id);		
		return oldBook; 

	}
	
	public static List<Book> getAll(){

		return new ArrayList<Book>(bookMap.values());

	}
	
	public static Book getById(BigInteger id){

		return bookMap.get(id);

	}
	
	static {
		Book book =new Book("Let Us C","Balguruswami",500.00);
		Book book1 =new Book("Jave by Heart","A Yadav",500.00); 
		save(book);
		save(book1);
	}

}
