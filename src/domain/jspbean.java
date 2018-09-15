package domain;

public class jspbean {
	private String id;
	private String pwcheck;
	private String name;
	private String birth;
	private String nick;
	private String department;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwcheck() {
		return pwcheck;
	}
	public void setPwcheck(String pwcheck) {
		this.pwcheck = pwcheck;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getbirth() {
		return birth;
	}
	
	public void setbirth(String birth) {
		this.birth = birth;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
}
