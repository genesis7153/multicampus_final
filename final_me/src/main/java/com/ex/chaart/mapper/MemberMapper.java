package com.ex.chaart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ex.chaart.VO.MemberVO;

public interface MemberMapper {
	
	   @Select("select * from MEMBER limit 100")
	   public List<MemberVO> getMemberList()throws Exception;  
	  
	   @Insert("INSERT INTO MEMBER(ID, PASSWORD, NAME, EMAIL)"         //, CRE_DATE, MOD_DATE) "
	         + "VALUES(#{id}, #{password}, #{name}, #{email})")               //, NOW(), NOW())")
	   public int insertMember(MemberVO member)throws Exception;   
	   
	   @Select("select * from MEMBER where ID=#{id} AND PASSWORD=#{password}")
	   public MemberVO getLoginMember(@Param("id")String id, @Param("password")String password)throws Exception;
	   
	   @Update("UPDATE MEMBER SET ID=#{id}, PASSWORD=#{passwrod}, "
			   + " NAME=#{name},  EMAIL=#{email}")
//	           + " NAME=#{name}" + " EMAIL=#{email}")                 //, MOD_DATE=NOW() WHERE MNO=#{mno}")
	   public boolean updateMember(MemberVO member)throws Exception;
	   

	   
	   


} 
