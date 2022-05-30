package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.Criteria;
import com.jsp.dto.MemberVO;

public interface MemberDAO {
	//회원리스트 조회
	List<MemberVO> selectMemberList(SqlSession session)throws SQLException;
	List<MemberVO> selectMemberList(SqlSession session, Criteria cri) throws Exception;		
	// 일반 리스트 전체 개수
	int selectMemberListCount(SqlSession session) throws Exception;
	int selectMemberListCount(SqlSession session, Criteria cri) throws Exception;
	// 회원정보 조회
	MemberVO selectMemberById(SqlSession session,String id) throws SQLException;
	
	//insert
	void insertMember(SqlSession session, MemberVO vo) throws SQLException;
	
//	//update
	void updateMember(SqlSession session, MemberVO vo) throws SQLException;
	
//	//delete
	void deleteMember(SqlSession session, String id) throws SQLException;
	
	void enabledMember(SqlSession session, String id, int enabled);
}






