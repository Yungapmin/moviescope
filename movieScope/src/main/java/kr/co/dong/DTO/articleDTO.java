package kr.co.dong.DTO;

import java.sql.Date;

public class articleDTO {

	private int a_number;
	private int FK_b_number;
	private int FK_u_number;
	private String a_context;
	private Date a_date;
	
	public articleDTO(int a_number, int fK_b_number, int fK_u_number, String a_context, Date a_date) {
		super();
		this.a_number = a_number;
		FK_b_number = fK_b_number;
		FK_u_number = fK_u_number;
		this.a_context = a_context;
		this.a_date = a_date;
	}

	public int getA_number() {
		return a_number;
	}

	public void setA_number(int a_number) {
		this.a_number = a_number;
	}

	public int getFK_b_number() {
		return FK_b_number;
	}

	public void setFK_b_number(int fK_b_number) {
		FK_b_number = fK_b_number;
	}

	public int getFK_u_number() {
		return FK_u_number;
	}

	public void setFK_u_number(int fK_u_number) {
		FK_u_number = fK_u_number;
	}

	public String getA_context() {
		return a_context;
	}

	public void setA_context(String a_context) {
		this.a_context = a_context;
	}

	public Date getA_date() {
		return a_date;
	}

	public void setA_date(Date a_date) {
		this.a_date = a_date;
	}

	@Override
	public String toString() {
		return "articleDTO [a_number=" + a_number + ", FK_b_number=" + FK_b_number + ", FK_u_number=" + FK_u_number
				+ ", a_context=" + a_context + ", a_date=" + a_date + "]";
	}
}
