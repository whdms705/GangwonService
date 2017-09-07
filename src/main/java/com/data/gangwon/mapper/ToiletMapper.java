package com.data.gangwon.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.data.gangwon.dto.ToiletDTO;


@Mapper
public interface ToiletMapper {

	 
	 public Integer toiletCount();
	    

	 List<ToiletDTO> getToiletList(ToiletDTO toiletDTO);
	    
	 //LateDiseaseDTO lateDiseaseDetail(int id);
	        
	 //2占쏙옙 占싱삼옙占쏙옙 占식띰옙占쏙옙拷占� 占싼깍옙占쏙옙占� @Param占쏙옙占쏙옙 占쏙옙占쏙옙 or 占쌓곤옙 占쏙옙占쏙옙占쏙옙 map占쏙옙占쏙옙 占싼겨띰옙
	 //String[] autocomplete(@Param("type") int type, @Param("text") String text, @Param("category") String category);
	    
	
}
