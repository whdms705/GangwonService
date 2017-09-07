package com.data.gangwon.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.gangwon.dto.ParkingDTO;
import com.data.gangwon.mapper.ParkingMapper;



@RestController
public class ParkingController {

	@Autowired
	ParkingMapper parkingMapper;
	
	//본인위치로부터 주변 주차장 찾기
	@RequestMapping(path = "/parking", method = RequestMethod.GET)
	@ResponseBody			
	public List<ParkingDTO> getParkingDataList(HttpServletRequest request, HttpServletResponse response ) {

		response.addHeader("Access-Control-Allow-Origin", "*");
		ParkingDTO parkingDTO=new ParkingDTO();
		System.out.println(request.getParameter("lat")+" / "+request.getParameter("lng"));
		// gps 실제로는 아래꺼 주석풀어야함
		parkingDTO.setGpsLng(request.getParameter("lng"));
		parkingDTO.setGpsLat(request.getParameter("lat"));
		
		parkingDTO.setGpsLat("37.81774409");	//媛��뜲�씠�꽣
		parkingDTO.setGpsLng("127.7158708");	//媛��뜲�씠�꽣

		List<ParkingDTO> parkingList = parkingMapper.getParkingList(parkingDTO);

		return parkingList;
	}
	
	//주차장 댓글리스트
	@RequestMapping(path = "/parkingCmtList")  
	@ResponseBody			//�뵒鍮꾩뿉�꽌 議고쉶�븳 寃곌낵瑜� json�쑝濡� 蹂대궡以�
	public List<ParkingDTO> getParkingCmtList(HttpServletRequest request, HttpServletResponse response ) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		ParkingDTO parkingDTO=new ParkingDTO();
		System.out.println(request.getParameter("seq"));
		parkingDTO.setSeq(request.getParameter("seq"));
		List<ParkingDTO> parkingList = parkingMapper.getParkingCmtList(parkingDTO);

		return parkingList;
	}
	
	//주차장 댓글등록
	//공중화장실 댓글등록(댓글시퀀스 자동증가하는지 확인해야함)
	@RequestMapping(path = "/parkingCmtRegist")
	@ResponseBody			//�뵒鍮꾩뿉�꽌 議고쉶�븳 寃곌낵瑜� json�쑝濡� 蹂대궡以�
	public String toiletCmtRegistAction(HttpServletRequest request, HttpServletResponse response ) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		ParkingDTO parkingDTO=new ParkingDTO();
		System.out.println(request.getParameter("seq"));
		String seq = request.getParameter("seq");
		
		parkingDTO.setSeq(seq);
		parkingDTO.setGubun("parkingdata");
		parkingDTO.setCmt_content(request.getParameter("cmt_content"));
		parkingDTO.setCmt_id(request.getParameter("cmt_id"));
		
		parkingMapper.parkingCommentRegist(parkingDTO);
	
		return seq;
	}
	
}
