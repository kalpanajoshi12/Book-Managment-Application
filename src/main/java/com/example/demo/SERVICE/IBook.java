package com.example.demo.SERVICE;

import java.util.List;

import com.example.demo.ENTITY.BookEntity;

public interface IBook {
	public BookEntity saveTheBook(BookEntity book);
	
	public List<BookEntity> getAllTheBooks();
	
	public BookEntity getParticularBook(int bookId);
	
	public String deleteTheparticularId(int id);
	
	public BookEntity updateTheParticularData(BookEntity bookData);

}
