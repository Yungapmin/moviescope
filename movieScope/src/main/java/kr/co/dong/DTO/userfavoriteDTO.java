package kr.co.dong.DTO;

public class userfavoriteDTO {
	private int uf_number;
	private int FK_m_number;
	private int FK_u_number;
	private String uf_grade;
	private String uf_review;
	private String userfavoritecol;
	
	public userfavoriteDTO(int uf_number, int fK_m_number, int fK_u_number, String uf_grade, String uf_review,
			String userfavoritecol) {
		super();
		this.uf_number = uf_number;
		FK_m_number = fK_m_number;
		FK_u_number = fK_u_number;
		this.uf_grade = uf_grade;
		this.uf_review = uf_review;
		this.userfavoritecol = userfavoritecol;
	}

	public int getUf_number() {
		return uf_number;
	}

	public void setUf_number(int uf_number) {
		this.uf_number = uf_number;
	}

	public int getFK_m_number() {
		return FK_m_number;
	}

	public void setFK_m_number(int fK_m_number) {
		FK_m_number = fK_m_number;
	}

	public int getFK_u_number() {
		return FK_u_number;
	}

	public void setFK_u_number(int fK_u_number) {
		FK_u_number = fK_u_number;
	}

	public String getUf_grade() {
		return uf_grade;
	}

	public void setUf_grade(String uf_grade) {
		this.uf_grade = uf_grade;
	}

	public String getUf_review() {
		return uf_review;
	}

	public void setUf_review(String uf_review) {
		this.uf_review = uf_review;
	}

	public String getUserfavoritecol() {
		return userfavoritecol;
	}

	public void setUserfavoritecol(String userfavoritecol) {
		this.userfavoritecol = userfavoritecol;
	}

	@Override
	public String toString() {
		return "userfavoriteDTO [uf_number=" + uf_number + ", FK_m_number=" + FK_m_number + ", FK_u_number="
				+ FK_u_number + ", uf_grade=" + uf_grade + ", uf_review=" + uf_review + ", userfavoritecol="
				+ userfavoritecol + "]";
	}
	
	
	
	
}
