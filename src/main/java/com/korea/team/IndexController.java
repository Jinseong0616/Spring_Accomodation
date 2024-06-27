package com.korea.team;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.BusinessDAO;
import lombok.RequiredArgsConstructor;
import util.MyCommon;

@Controller
@RequiredArgsConstructor
public class IndexController {

	final BusinessDAO business_dao;

	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpSession session;

	@RequestMapping(value = { "/", "index" })
	public String main(Model model) {
		model.addAttribute(model);
		return MyCommon.VIEW_PATH + "main/index.jsp";
	}

	// �α��� ��� ����
	@RequestMapping("login_form")
	public String login_form() {
		return MyCommon.VIEW_PATH + "member/login_form.jsp";
	}

	// �̸��Ϸ� �����ϱ� ����
	@RequestMapping("login_email")
	public String login_form_user() {
		
		return MyCommon.VIEW_PATH + "member/login_form_user.jsp";
	}

	// ����Ͻ� �α���
	@RequestMapping("login_business")
	public String login_form_business() {
		
		return MyCommon.VIEW_PATH + "business/login_form_business.jsp";
	}
	
	@RequestMapping("map")
	public String map() {
		return MyCommon.VIEW_PATH + "main/map.jsp";
	}
}
