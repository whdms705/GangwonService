package com.data.gangwon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.data.gangwon.dto.ParkingDTO;
import com.data.gangwon.dto.ToiletDTO;

@Mapper
public interface ParkingMapper {

	 //������ġ �������� �ֺ������� �ִ�10��ã��(�������浵�� ��� �� ó�� �����Ͱ� ǥ��)
	 List<ParkingDTO> getParkingList(ParkingDTO parkingDTO);

	 //seq�� �ش��ϴ� �����忡 ���� ��۸���Ʈ ��ȸ
	 public List<ParkingDTO> getParkingCmtList(ParkingDTO parkingDTO);
	 
	 //seq�� �ش��ϴ� �����忡 ���� ��� ���
 	 public void parkingCommentRegist(ParkingDTO parkingDTO);

}
