package com.ex.chaart.Controller;



import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ex.chaart.Service.MemberService;
import com.ex.chaart.VO.MemberVO;
import com.ex.chaart.dao.MemberDao;
import com.ex.chaart.serviceImpl.MemberServiceImpl;

@Controller
public class MemberController {
	
	private static  Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberServiceImpl service;
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception {
		logger.info("post register");
		service.register(vo);
//		return "redirect:login.html";
		return "login.html";		


	}

		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String postLogin(MemberVO vo, HttpServletRequest request, RedirectAttributes rttr) throws Exception {
			    logger.info("post login");
		
				HttpSession session = request.getSession();
				MemberVO login = service.login(vo);
				
				if(login == null) {
					session.setAttribute("member", null);
					rttr.addFlashAttribute("msg", false);
//					return "redirect:login.html";
					return "login.html";
				}else {
					session.setAttribute("member", login);
//					return "redirect:index.html";
					return "index.html";
				}
			    

			
		}
		

		@GetMapping(path="/logout")
		public String login(HttpSession session) {
			session.removeAttribute("member");
			return "redirect:index.html";
	   }

}
