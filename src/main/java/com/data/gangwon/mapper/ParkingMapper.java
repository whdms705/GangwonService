package com.data.gangwon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.data.gangwon.dto.ParkingDTO;
import com.data.gangwon.dto.ToiletDTO;

@Mapper
public interface ParkingMapper {

	 //본인위치 기준으로 주변주차장 최대10건찾기(동일위경도일 경우 맨 처음 데이터가 표출)
	 List<ParkingDTO> getParkingList(ParkingDTO parkingDTO);

	 //seq에 해당하는 주차장에 대한 댓글리스트 조회
	 public List<ParkingDTO> getParkingCmtList(ParkingDTO parkingDTO);
	 
	 //seq에 해당하는 주차장에 대한 댓글 등록
 	 public void parkingCommentRegist(ParkingDTO parkingDTO);

}
