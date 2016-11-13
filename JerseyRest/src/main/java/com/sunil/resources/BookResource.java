package com.sunil.resources;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/books")
//@Produces(MediaType.APPLICATION_JSON)
public class BookResource {	
	
	//Here method returns response w.r.t. very 1st mediatype by default (if no mediatype is mentioned in header)
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Book> getBooks(){
		
		//return Response.ok(new ArrayList<Book>(bookMap.values())).build();
		return BookService.getAll();
		
	}
	
	@POST
	//@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book addBook(Book book){
		
		BookService.save(book);
		return book;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getById(@PathParam("id") BigInteger id){
		
		return BookService.getById(id);
		
			
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book updateBook(@PathParam("id") BigInteger id,Book book){
		book.setId(id);
		return BookService.update(book);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book deleteBook(@PathParam("id") BigInteger id){
		return BookService.remove(id); 
	}
	
	
	

}
