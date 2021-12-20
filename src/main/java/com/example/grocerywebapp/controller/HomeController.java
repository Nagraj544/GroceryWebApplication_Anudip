package com.example.grocerywebapp.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocerywebapp.entity.CheckoutData;
import com.example.grocerywebapp.entity.UserData;
import com.example.grocerywebapp.repository.CheckRepository;
import com.example.grocerywebapp.repository.ContactRepository;
import com.example.grocerywebapp.repository.UserRepository;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/homelogin")
	public String homelogin()
	{
		return "home1";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("/fruits")
	public String fruits()
	{
		return "fruits";
	}
	
	@GetMapping("/vegitables")
	public String vegitables()
	{
		return "vegitables";
	}
	
	@GetMapping("/nuts&seeds")
	public String nutsandseeds()
	{
		return "nuts&seeds";
	}
	
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/checkoutnote";
	}
	
//	@GetMapping("/login")
//	public String login()
//	{
//		return "login";
//	}
//	
//	@PostMapping("/login")
//	public String login(@ModelAttribute LoginData u, HttpSession session)
//	{
//		System.out.println(u);
//		
//		
//		return "redirect:/home";
//	}
//	
//	@PostMapping("/contact")
//	public String contact(@ModelAttribute ContactData u, HttpSession session)
//	{
//		con.save(u);
//		session.setAttribute("message", "User Register Successfully");
//		
//		
//		return "redirect:/home";
//	}
	
}
