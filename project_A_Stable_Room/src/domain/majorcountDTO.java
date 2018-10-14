package domain;

public class majorcountDTO {
	private String major;
	private String usecount;
	
	
	
	public majorcountDTO() {super();}
	public majorcountDTO(String major, String usecount) {
		super();
		this.major = major;
		this.usecount = usecount;
	}
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getUsecount() {
		return usecount;
	}
	public void setUsecount(String usecount) {
		this.usecount = usecount;
	}

}
