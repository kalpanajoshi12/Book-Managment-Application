package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.ENTITY.BookEntity;
import com.example.demo.SERVICE.BookService;

@Controller
public class HomeController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String  displayHomePage(Model dataBasket ) {
		List<BookEntity> receivedAllBookInfo=bookService.getAllTheBooks();
		dataBasket.addAttribute("allBooksData",receivedAllBookInfo);
		return "myHomePage";
	}
	
	@GetMapping("/add/Book")
	public String  displayBookForm(Model bookBasket) {
		
		bookBasket.addAttribute("bookref",new BookEntity());
		return "addBook";
	}

	@PostMapping("/collect/book")
	public String collectBookData(@ModelAttribute BookEntity receivedBookData) {
		BookEntity recievedBookInfo = bookService.saveTheBook(receivedBookData);
		return "confirmbook";
	}
	
	@GetMapping("/read/books/all")
	public String readAllBooks(Model dataBasket) {
		List<BookEntity> receivedAllBookInfo=bookService.getAllTheBooks();
		dataBasket.addAttribute("allBooksData",receivedAllBookInfo);
		return "allBooks";
	}
	
	@GetMapping("/read/particular/book/{bookId}")
	public String readParticularBook(@PathVariable ("bookId") String id,Model DataBaseket) {
		BookEntity recevedParticularBookData=bookService.getParticularBook(Integer.parseInt(id));
		DataBaseket.addAttribute("particularData",recevedParticularBookData);
		return "particularData";
	}
	
	@GetMapping("/delete/particular/book/{bookid}")
	public String deleteParticularBookData(@PathVariable ("bookid") String id,Model MassageBasket) {
		String recievedConfirmationmassage = bookService.deleteTheparticularId(Integer.parseInt(id));
		MassageBasket.addAttribute("deleteMassage",recievedConfirmationmassage);
		return "deleteMassage";
	}
	
	@GetMapping("/update/book/{bookid}")
	public String displayBookUpdateForm(@PathVariable ("bookid") String id, Model dataBasket) {
		BookEntity recivedParticularBookData = bookService.getParticularBook(Integer.parseInt(id));	
		dataBasket.addAttribute("bookData",recivedParticularBookData);
	    return "displayUpdateForm";
	}
	
	@PostMapping("/update/collect/data")
	public String updateTheParticularData(@ModelAttribute BookEntity recievedBookData) {
	BookEntity updatedBookData=bookService.updateTheParticularData(recievedBookData);
	return "redirect:/read/books/all";
		}
}
