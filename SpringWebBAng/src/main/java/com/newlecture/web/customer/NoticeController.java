package com.newlecture.web.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		int page = 2;
		String field = "title";
		String query = "";
		
		List<NoticeView> list = service.getViewList(page, field, query);
		
		model.addAttribute("list" , list);
		System.out.println("customer1");
		return "customer.notice.list"; //ResourceViewResolver
	}
	
	@RequestMapping("detail")
	public String detail() {
		System.out.println("customer2");
		return "customer.notice.detail";
	}
	
}
