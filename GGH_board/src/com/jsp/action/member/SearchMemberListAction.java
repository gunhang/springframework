package com.jsp.action.member;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.command.Criteria;
import com.jsp.dto.MemberVO;
import com.jsp.service.SearchMemberService;

public class SearchMemberListAction implements Action {

	private SearchMemberService searchMemberService;
	public void setSearchMemberService(SearchMemberService searchMemberService) {
		this.searchMemberService = searchMemberService;
		
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "member/list";
		
		
		return url;
	}

}
