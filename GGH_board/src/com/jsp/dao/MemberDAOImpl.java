package com.jsp.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public List<MemberVO> selectMemberList(SqlSession session) throws SQLException {
		List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList");
		return memberList;
	}

	@Override
	public List<MemberVO> selectMemberList(SqlSession session, Criteria cri) throws Exception {
		List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList",cri);
		return memberList;
	}

	@Override
	public int selectMemberListCount(SqlSession session) throws Exception {
		int cnt = session.selectOne("Member-Mapper.selectMemberListCount");
		return cnt;
	}

	@Override
	public int selectMemberListCount(SqlSession session, Criteria cri) throws Exception {
		int cnt = session.selectOne("Member-Mapper.selectSearchMemberListCount",cri);
		return cnt;
	}

	@Override
	public MemberVO selectMemberById(SqlSession session, String id) throws SQLException {
		MemberVO member = session.selectOne("", id);
		return member;
	}

	@Override
	public void insertMember(SqlSession session, MemberVO vo) throws SQLException {
		session.update("", vo);
	}

	@Override
	public void updateMember(SqlSession session, MemberVO vo) throws SQLException {
		session.update("", vo);
	}

	@Override
	public void deleteMember(SqlSession session, String id) throws SQLException {
		session.update("", id);
	}

	@Override
	public void enabledMember(SqlSession session, String id, int enabled) {
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("id", id);
		dataMap.put("enabled" , enabled);
		
		session.update("", dataMap);
	}
}








