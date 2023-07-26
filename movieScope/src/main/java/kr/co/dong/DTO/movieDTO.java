package kr.co.dong.DTO;

public class movieDTO {
	
	private int m_number;
	private String m_name;
	private String m_opening;
	private String m_reopening;
	private String m_genre;
	private String m_runtime;
	private String m_grade;
	private String m_director;
	private String m_actor;
	private String m_attendance;
	private String m_awards;
	
	public movieDTO(int m_number, String m_name, String m_opening, String m_reopening, String m_genre, String m_runtime,
			String m_grade, String m_director, String m_actor, String m_attendance, String m_awards) {
		super();
		this.m_number = m_number;
		this.m_name = m_name;
		this.m_opening = m_opening;
		this.m_reopening = m_reopening;
		this.m_genre = m_genre;
		this.m_runtime = m_runtime;
		this.m_grade = m_grade;
		this.m_director = m_director;
		this.m_actor = m_actor;
		this.m_attendance = m_attendance;
		this.m_awards = m_awards;
	}
	public int getM_number() {
		return m_number;
	}
	public void setM_number(int m_number) {
		this.m_number = m_number;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_opening() {
		return m_opening;
	}
	public void setM_opening(String m_opening) {
		this.m_opening = m_opening;
	}
	public String getM_reopening() {
		return m_reopening;
	}
	public void setM_reopening(String m_reopening) {
		this.m_reopening = m_reopening;
	}
	public String getM_genre() {
		return m_genre;
	}
	public void setM_genre(String m_genre) {
		this.m_genre = m_genre;
	}
	public String getM_runtime() {
		return m_runtime;
	}
	public void setM_runtime(String m_runtime) {
		this.m_runtime = m_runtime;
	}
	public String getM_grade() {
		return m_grade;
	}
	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}
	public String getM_director() {
		return m_director;
	}
	public void setM_director(String m_director) {
		this.m_director = m_director;
	}
	public String getM_actor() {
		return m_actor;
	}
	public void setM_actor(String m_actor) {
		this.m_actor = m_actor;
	}
	public String getM_attendance() {
		return m_attendance;
	}
	public void setM_attendance(String m_attendance) {
		this.m_attendance = m_attendance;
	}
	public String getM_awards() {
		return m_awards;
	}
	public void setM_awards(String m_awards) {
		this.m_awards = m_awards;
	}
	
	@Override
	public String toString() {
		return "movieDTO [m_number=" + m_number + ", m_name=" + m_name + ", m_opening=" + m_opening + ", m_reopening="
				+ m_reopening + ", m_genre=" + m_genre + ", m_runtime=" + m_runtime + ", m_grade=" + m_grade
				+ ", m_director=" + m_director + ", m_actor=" + m_actor + ", m_attendance=" + m_attendance
				+ ", m_awards=" + m_awards + "]";
	}
	
	
	
}
