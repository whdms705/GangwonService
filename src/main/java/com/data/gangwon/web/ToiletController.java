package com.data.gangwon.web;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.gangwon.dto.ToiletDTO;
import com.data.gangwon.mapper.ToiletMapper;



//@Controller
@RestController
public class ToiletController {
	
	@Autowired
	ToiletMapper toiletMapper;
	
	//cordova id �� #���� ���� path�� ���ƾ���
	@RequestMapping(path = "/toilet", method = RequestMethod.GET)
	@ResponseBody			//디비에서 조회한 결과를 json으로 보내줌
	public List<ToiletDTO> getLateDiseaseList(HttpServletRequest request,/*@RequestBody ToiletDTO toiletDTO*/ HttpServletResponse response ) {

//		@RequestBody : cordova에서 보낸 데이터를 json으로 받는다는것
		response.addHeader("Access-Control-Allow-Origin", "*");
		ToiletDTO toiletDTO=new ToiletDTO();
		System.out.println(request.getParameter("lat")+" / "+request.getParameter("lng"));
		// gps 정보 받아서 할 때 : 추후 이거 주석 해제 toiletDTO.setGpsLng(request.getParameter("lng"));
		// gps 정보 받아서 할 때 : 추후 이거 주석 해제 toiletDTO.setGpsLat(request.getParameter("lat"));
		toiletDTO.setGpsLat("37.81774409");	//가데이터
		toiletDTO.setGpsLng("127.7158708");	//가데이터

		List<ToiletDTO> toiletList = toiletMapper.getToiletList(toiletDTO);

		return toiletList;
	}
	
	/*	@RequestMapping(path = "/toilet", method = RequestMethod.GET)
		public Map<String,Object> getLateDiseaseList2(@RequestParam(value = "toiletDTO") ToiletDTO toiletDTO) {

			
			Map<String,Object> map = new HashMap<String,Object>();


			ToiletDTO[] toiletList = toiletMapper.getToiletList(toiletDTO);

			map.put("toiletList", toiletList);


			return map;
		}*/

	
    @RequestMapping(value = "/demo")
	@ResponseBody
	public Integer index() {
		return toiletMapper.toiletCount();
	}

}
