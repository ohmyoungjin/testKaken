package net.hb.crud;

import org.springframework.web.multipart.MultipartFile;

public class BoardDTO {
	private String email;
	private String name;
	private String title;
	private String content;
	private String gender;
	private int pay;
	private int rn;
	private int sabun;
	private int hit;
	private java.util.Date wdate;
	
	private int hobbyy_idx;
	private String hobby;
	private String img_file_name;
	private MultipartFile upload_f;
	

	public int getHobbyy_idx() {
		return hobbyy_idx;
	}
	public void setHobbyy_idx(int hobbyy_idx) {
		this.hobbyy_idx = hobbyy_idx;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getImg_file_name() {
		return img_file_name;
	}
	public void setImg_file_name(String img_file_name) {
		this.img_file_name = img_file_name;
	}
	public MultipartFile getUpload_f() {
		return upload_f;
	}
	public void setUpload_f(MultipartFile upload_f) {
		this.upload_f = upload_f;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public java.util.Date getWdate() {
		return wdate;
	}
	public void setWdate(java.util.Date wdate) {
		this.wdate = wdate;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
