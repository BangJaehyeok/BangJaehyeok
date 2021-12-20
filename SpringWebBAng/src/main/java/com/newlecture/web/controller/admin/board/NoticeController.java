package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
		@RequestMapping("list")
		public String list(Model model) {
			
			List<NoticeView> list = service.getList();
			
			model.addAttribute("test", "Hello~ Admin");
			System.out.println("어드민테스트1");
			return "admin.board.notice.list";
		}
		
		@RequestMapping("detail")
		public String detail() {
			
			Notice notice = service.get(1);
			
			System.out.println("어드민테스트2");
			return "admin.board.notice.detail";
		}
		
		@RequestMapping("reg")
		public String reg() {
			System.out.println("어드민테스트3");
			return "admin.board.notice.reg";
		}
}
