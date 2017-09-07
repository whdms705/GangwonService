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

import com.data.gangwon.dto.ToiletDTO;
import com.data.gangwon.mapper.ToiletMapper;

//@Controller
@RestController
public class ToiletController {
	
	@Autowired
	ToiletMapper toiletMapper;
	
	//데모테스트
    @RequestMapping(value = "/demo")
	@ResponseBody
	public Integer index() {
		return toiletMapper.toiletCount();
	}	
	
	//cordova id 占쏙옙 #占쏙옙占쏙옙 占쏙옙占쏙옙 path占쏙옙 占쏙옙占싣억옙占쏙옙
	@RequestMapping(path = "/toilet", method = RequestMethod.GET)
	@ResponseBody			//�뵒鍮꾩뿉�꽌 議고쉶�븳 寃곌낵瑜� json�쑝濡� 蹂대궡以�
	public List<ToiletDTO> getToiletDataList(HttpServletRequest request,/*@RequestBody ToiletDTO toiletDTO*/ HttpServletResponse response ) {

//		@RequestBody : cordova�뿉�꽌 蹂대궦 �뜲�씠�꽣瑜� json�쑝濡� 諛쏅뒗�떎�뒗寃�
		response.addHeader("Access-Control-Allow-Origin", "*");
		ToiletDTO toiletDTO=new ToiletDTO();
		System.out.println(request.getParameter("lat")+" / "+request.getParameter("lng"));
		/* gps 실제로는 아래꺼 주석풀어야함
		toiletDTO.setGpsLng(request.getParameter("lng"));
		toiletDTO.setGpsLat(request.getParameter("lat"));
		*/
		toiletDTO.setGpsLat("37.81774409");	//媛��뜲�씠�꽣
		toiletDTO.setGpsLng("127.7158708");	//媛��뜲�씠�꽣

		List<ToiletDTO> toiletList = toiletMapper.getToiletList(toiletDTO);

		return toiletList;
	}
	
	@RequestMapping(path = "/toiletCmtList")  
	@ResponseBody			//�뵒鍮꾩뿉�꽌 議고쉶�븳 寃곌낵瑜� json�쑝濡� 蹂대궡以�
	public List<ToiletDTO> getToiletCmtList(HttpServletRequest request, HttpServletResponse response ) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		ToiletDTO toiletDTO=new ToiletDTO();
		System.out.println(request.getParameter("seq"));
		toiletDTO.setSeq(request.getParameter("seq"));
		List<ToiletDTO> toiletList = toiletMapper.getToiletCmtList(toiletDTO);

		return toiletList;
	}
	
	//공중화장실 댓글등록(댓글시퀀스 자동증가하는지 확인해야함)
	@RequestMapping(path = "/toiletCmtRegist")
	@ResponseBody			//�뵒鍮꾩뿉�꽌 議고쉶�븳 寃곌낵瑜� json�쑝濡� 蹂대궡以�
	public String toiletCmtRegistAction(HttpServletRequest request,/*@RequestBody ToiletDTO toiletDTO*/ HttpServletResponse response ) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		ToiletDTO toiletDTO=new ToiletDTO();
		System.out.println(request.getParameter("seq"));
		String seq = request.getParameter("seq");
		
		toiletDTO.setSeq(seq);
		toiletDTO.setGubun("toiletdata");
		toiletDTO.setCmt_content(request.getParameter("cmt_content"));
		toiletDTO.setCmt_id(request.getParameter("cmt_id"));
		
		toiletMapper.commentRegist(toiletDTO);
	
		return seq;
	}
	

}
