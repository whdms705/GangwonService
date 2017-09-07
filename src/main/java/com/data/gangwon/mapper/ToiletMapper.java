package com.data.gangwon.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.data.gangwon.dto.ToiletDTO;


@Mapper
public interface ToiletMapper {

	 //데모테스트
	 public Integer toiletCount();
	 
	 //본인위치 기준으로 주변화장실 최대10건찾기(동일위경도일 경우 맨 처음 데이터가 표출)
	 List<ToiletDTO> getToiletList(ToiletDTO toiletDTO);


	 //seq에 해당하는 화장실에 대한 댓글리스트 조회
	 public List<ToiletDTO> getToiletCmtList(ToiletDTO toiletDTO);
	 
	 //seq에 해당하는 화장실에 대한 댓글 등록
  	 public void commentRegist(ToiletDTO toiletDTO);
}
