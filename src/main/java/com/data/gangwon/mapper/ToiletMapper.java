package com.data.gangwon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.data.gangwon.dto.ToiletDTO;


@Mapper
public interface ToiletMapper {

	 @Select("select count(*) from TOILET_TB;")
	 public Integer toiletCount();
	    

	 List<ToiletDTO> getToiletList(ToiletDTO toiletDTO);
	    
	 //LateDiseaseDTO lateDiseaseDetail(int id);
	        
	 //2�� �̻��� �Ķ���͸� �ѱ���� @Param���� ���� or �װ� ������ map���� �Ѱܶ�
	 //String[] autocomplete(@Param("type") int type, @Param("text") String text, @Param("category") String category);
	    
	
}
