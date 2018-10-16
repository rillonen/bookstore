package com.example.Bookstore.web;

import com.example.Bookstore.domain.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
		@RequestMapping(value="/index", method=RequestMethod.GET)
		public String getNewBookForm(Model model){
			model.addAttribute("book", new Book());
		return "bookform";
		}
		
		@RequestMapping(value="/newbook", method=RequestMethod.POST)
		public String getNewCarForm(@ModelAttribute Book book, Model model){
			model.addAttribute("book", book);
			return "bookresult";
		}
}
