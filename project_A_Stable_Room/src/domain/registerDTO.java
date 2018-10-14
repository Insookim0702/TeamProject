package domain;

import java.util.Date;

public class registerDTO {
	private String today;
	private String id;
	private String name;
	private String major;
	private String phone;
	private String bednum;
	private String intime;
	private String outtime;
	private String inout;
	
	public registerDTO() {super();}
	public registerDTO(String today, String id, String name, String major, String phone, String bednum, String intime,String outtime,String inout) {
		super();
		this.today =today;
		this.id = id;
		this.name = name;
		this.major = major;
		this.phone = phone;
		this.bednum = bednum;
		this.intime = intime;
		this.outtime = outtime;
		this.inout = inout;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBednum() {
		return bednum;
	}
	public void setBednum(String bednum) {
		this.bednum = bednum;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
}
