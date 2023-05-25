package com.hnbcoffee.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnbcoffee.Entity.CartItem;
import com.hnbcoffee.Utils.DataSharing;

@Controller
@RequestMapping("/hnbcoffee")
public class BeverageDetailController {
	
	@GetMapping("/coffee/detail/{beverageId}")
    public String showProductDetail(@PathVariable("beverageId") Integer beverageId, Model model) {
		CartItem items = DataSharing.items.get(beverageId);
        model.addAttribute("beverage", items);
        return "user/beveragedetail";
    }
	
	@ModelAttribute("sizes")
	public Map<String, String> geSize() {
		Map<String, String> map = new HashMap<>();
		map.put("S", "0");
		map.put("M", "5000");
		map.put("L", "10000");

		return map;
	}
}