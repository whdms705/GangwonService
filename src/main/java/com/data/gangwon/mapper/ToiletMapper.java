package com.data.gangwon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.data.gangwon.dto.ToiletDTO;

@Mapper
public interface ToiletMapper {

	 @Select("select count(*) from TOILET_TB;")
	    public Integer toiletCount();
	 
	
}
