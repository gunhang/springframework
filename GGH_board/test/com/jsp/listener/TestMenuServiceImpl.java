package com.jsp.listener;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jsp.context.ApplicationContext;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

public class TestMenuServiceImpl {

	private MemberService memberService;
	
	@Before 	
	public void init()throws Exception{
		MockApplicationContextInitListener listener 
			= new MockApplicationContextInitListener();
		
		String beanConfigXml ="classpath:com/jsp/context/application-context.xml";
		
		listener.contextInitialized(beanConfigXml);
		
		memberService = (MemberService) ApplicationContext.getApplicationContext().get("menuService");
	}
	
	@Test
	public void testGetMenuList() throws Exception{
		List<MemberVO> menuList = memberService.getMemberList();
		
		Assert.assertEquals(5, menuList.size());	
	}
	
	@After
	public void destory()throws Exception{
		
	}
}
