package com.jsp.action.common;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

public class IndexPageAction implements Action{

	private MemberService memberService;
	public void setMenuService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "common/indexPage";
		
		String mCode = request.getParameter("mCode");
		
		if(mCode == null) mCode="M000000";
		
		try {
			List<MemberVO> menuList = memberService.getMemberList();
			
			request.setAttribute("menuList", menuList);
		}catch(SQLException e) {
			e.printStackTrace();
			
			throw e;
		}
		return url;
	}
}
