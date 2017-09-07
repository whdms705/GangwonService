package com.data.gangwon.dto;

public class ParkingDTO {
	
	private String gubun;
	private String seq;
	private String sido;
	private String gugun_nm;
	private String p_number;
	private String parking_nm;
	private String parking_part;
	private String parking_type;
	private String locplc_lotno_addr;
	private String locplc_roadnm_addr;
	private String p_use_week;
	private String p_stime;
	private String p_etime;
	private String p_sat_stime;
	private String p_sat_etime;
	private String p_holi_stime;
	private String p_holi_etime;
	private String p_pay;
	private String p_base_time;
	private String p_base_pay;
	private String p_add_time;
	private String p_add_pay;
	private String p_1day_time;
	private String p_1day_pay;
	private String p_month_pay;
	private String payment_mtd;
	private String parking_etc;
	private String lat;
	private String lng;
	private String data_dt;
	
	private String gpsLng;		//현재 본인위치 위도
	private String gpsLat;		//현재 본인위치 경도	
	
	//댓글
	private String cmt_seq;		//댓글시퀀스
	private String cmt_grade;	//댓글 별점
	private String cmt_dt;		//댓글등록일
	private String cmt_content;	//댓글내용
	private String cmt_id;		//댓글단사람이름
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun_nm() {
		return gugun_nm;
	}
	public void setGugun_nm(String gugun_nm) {
		this.gugun_nm = gugun_nm;
	}
	public String getP_number() {
		return p_number;
	}
	public void setP_number(String p_number) {
		this.p_number = p_number;
	}
	public String getParking_nm() {
		return parking_nm;
	}
	public void setParking_nm(String parking_nm) {
		this.parking_nm = parking_nm;
	}
	public String getParking_part() {
		return parking_part;
	}
	public void setParking_part(String parking_part) {
		this.parking_part = parking_part;
	}
	public String getParking_type() {
		return parking_type;
	}
	public void setParking_type(String parking_type) {
		this.parking_type = parking_type;
	}
	public String getLocplc_lotno_addr() {
		return locplc_lotno_addr;
	}
	public void setLocplc_lotno_addr(String locplc_lotno_addr) {
		this.locplc_lotno_addr = locplc_lotno_addr;
	}
	public String getLocplc_roadnm_addr() {
		return locplc_roadnm_addr;
	}
	public void setLocplc_roadnm_addr(String locplc_roadnm_addr) {
		this.locplc_roadnm_addr = locplc_roadnm_addr;
	}
	public String getP_use_week() {
		return p_use_week;
	}
	public void setP_use_week(String p_use_week) {
		this.p_use_week = p_use_week;
	}
	public String getP_stime() {
		return p_stime;
	}
	public void setP_stime(String p_stime) {
		this.p_stime = p_stime;
	}
	public String getP_etime() {
		return p_etime;
	}
	public void setP_etime(String p_etime) {
		this.p_etime = p_etime;
	}
	public String getP_sat_stime() {
		return p_sat_stime;
	}
	public void setP_sat_stime(String p_sat_stime) {
		this.p_sat_stime = p_sat_stime;
	}
	public String getP_sat_etime() {
		return p_sat_etime;
	}
	public void setP_sat_etime(String p_sat_etime) {
		this.p_sat_etime = p_sat_etime;
	}
	public String getP_holi_stime() {
		return p_holi_stime;
	}
	public void setP_holi_stime(String p_holi_stime) {
		this.p_holi_stime = p_holi_stime;
	}
	public String getP_holi_etime() {
		return p_holi_etime;
	}
	public void setP_holi_etime(String p_holi_etime) {
		this.p_holi_etime = p_holi_etime;
	}
	public String getP_pay() {
		return p_pay;
	}
	public void setP_pay(String p_pay) {
		this.p_pay = p_pay;
	}
	public String getP_base_time() {
		return p_base_time;
	}
	public void setP_base_time(String p_base_time) {
		this.p_base_time = p_base_time;
	}
	public String getP_base_pay() {
		return p_base_pay;
	}
	public void setP_base_pay(String p_base_pay) {
		this.p_base_pay = p_base_pay;
	}
	public String getP_add_time() {
		return p_add_time;
	}
	public void setP_add_time(String p_add_time) {
		this.p_add_time = p_add_time;
	}
	public String getP_add_pay() {
		return p_add_pay;
	}
	public void setP_add_pay(String p_add_pay) {
		this.p_add_pay = p_add_pay;
	}
	public String getP_1day_time() {
		return p_1day_time;
	}
	public void setP_1day_time(String p_1day_time) {
		this.p_1day_time = p_1day_time;
	}
	public String getP_1day_pay() {
		return p_1day_pay;
	}
	public void setP_1day_pay(String p_1day_pay) {
		this.p_1day_pay = p_1day_pay;
	}
	public String getP_month_pay() {
		return p_month_pay;
	}
	public void setP_month_pay(String p_month_pay) {
		this.p_month_pay = p_month_pay;
	}
	public String getPayment_mtd() {
		return payment_mtd;
	}
	public void setPayment_mtd(String payment_mtd) {
		this.payment_mtd = payment_mtd;
	}
	public String getParking_etc() {
		return parking_etc;
	}
	public void setParking_etc(String parking_etc) {
		this.parking_etc = parking_etc;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getData_dt() {
		return data_dt;
	}
	public void setData_dt(String data_dt) {
		this.data_dt = data_dt;
	}
	public String getGpsLng() {
		return gpsLng;
	}
	public void setGpsLng(String gpsLng) {
		this.gpsLng = gpsLng;
	}
	public String getGpsLat() {
		return gpsLat;
	}
	public void setGpsLat(String gpsLat) {
		this.gpsLat = gpsLat;
	}
	public String getCmt_seq() {
		return cmt_seq;
	}
	public void setCmt_seq(String cmt_seq) {
		this.cmt_seq = cmt_seq;
	}
	public String getCmt_grade() {
		return cmt_grade;
	}
	public void setCmt_grade(String cmt_grade) {
		this.cmt_grade = cmt_grade;
	}
	public String getCmt_dt() {
		return cmt_dt;
	}
	public void setCmt_dt(String cmt_dt) {
		this.cmt_dt = cmt_dt;
	}
	public String getCmt_content() {
		return cmt_content;
	}
	public void setCmt_content(String cmt_content) {
		this.cmt_content = cmt_content;
	}
	public String getCmt_id() {
		return cmt_id;
	}
	public void setCmt_id(String cmt_id) {
		this.cmt_id = cmt_id;
	}	
	
}
