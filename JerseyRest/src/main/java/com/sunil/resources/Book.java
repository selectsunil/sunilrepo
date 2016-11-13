package com.sunil.resources;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	
	private BigInteger id;
	private String name;
	private String author;
	private Double price;
	
	
	
	public Book() {
		
	}

	public Book(String name, String author, Double price) {
		super();
		
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
