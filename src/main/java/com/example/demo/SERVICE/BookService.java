package com.example.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ENTITY.BookEntity;
import com.example.demo.REPOSITORY.BookRepository;

@Service
public class BookService implements IBook {

	@Autowired
	private BookRepository bookRepo;
	
	
	@Override
	public BookEntity saveTheBook(BookEntity bookInfo) {
		BookEntity bookData = bookRepo.save(bookInfo);
		return bookData;
	}


	@Override
	public List<BookEntity> getAllTheBooks() {
	List<BookEntity> allBookData=bookRepo.findAll();
		return allBookData;
	}


	@Override
	public BookEntity getParticularBook(int bookId) {
		BookEntity readparticularBookData = bookRepo.findById(bookId).get();
		return readparticularBookData;
	}


	@Override
	public String deleteTheparticularId(int id) {
		
		bookRepo.deleteById(id);
		return "Book is deleted successfully!";
	}


	

	@Override
	public BookEntity updateTheParticularData(BookEntity bookData) {
		BookEntity myBookInfo = bookRepo.findById(bookData.getBookId()).get();
		myBookInfo.setBookId(bookData.getBookId());
		myBookInfo.setBookAuthor(bookData.getBookAuthor());
		myBookInfo.setBookImage(bookData.getBookImage());
		myBookInfo.setBookISBN(bookData.getBookISBN());
		myBookInfo.setBookName(bookData.getBookName());
		myBookInfo.setBookPrice(bookData.getBookPrice());
		BookEntity SavedUpdatedData=bookRepo.save(myBookInfo);
		return SavedUpdatedData;
	}

}
