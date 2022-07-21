package com.xworkz.corejava.Arrar_as_DAO.DTO;

public class StudentDTO {

	private String id;
	private String name;
	private String batchname;
	private long phno;
	private String percentage;


	public StudentDTO(String id,String name,String batchname,long phno,String percentage) {
		this.id = id;
		this.name = name;
		this.batchname = batchname;
		this.phno = phno;
		this.percentage = percentage;
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


	public String getBatchname() {
		return batchname;
	}


	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	public String getPercentage() {
		return percentage;
	}


	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", batchname=" + batchname + ", phno=" + phno
				+ ", percentage=" + percentage + "]";
	}


}