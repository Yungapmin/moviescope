package kr.co.dong.DAO;

import kr.co.dong.DTO.movieDTO;

public interface movieDAO {
	public int search(String m_name);
	public movieDTO detail(int m_number);
}
