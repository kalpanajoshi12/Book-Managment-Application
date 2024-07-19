package com.example.demo.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	private String bookImage;
	private String bookAuthor;
	private int bookISBN;
	private int bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(int bookISBN) {
		this.bookISBN = bookISBN;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public BookEntity(int bookId, String bookName, String bookImage, String bookAuthor, int bookISBN, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookImage = bookImage;
		this.bookAuthor = bookAuthor;
		this.bookISBN = bookISBN;
		this.bookPrice = bookPrice;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void displayAllTheDetails() {
		System.out.println(this.bookId);
		System.out.println(this.bookName);
		System.out.println(this.bookAuthor);
		System.out.println(this.bookISBN);
		System.out.println(this.bookPrice);
		System.out.println(this.bookImage);
		
	}
		

}
