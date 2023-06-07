package com.hnbcoffee.Controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnbcoffee.Sevice.*;


@Controller
@RequestMapping("/hnbcoffee")
public class HnBController {
	@Autowired
	ShoppingCartService cart;
	
	@Autowired
	SessionService session;
	
	@GetMapping("/home")
	public String homePageController() {
		session.set("cartCount", cart.getCount());
		return "user/index";
	}

}