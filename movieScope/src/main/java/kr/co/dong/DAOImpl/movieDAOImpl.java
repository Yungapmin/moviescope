package kr.co.dong.DAOImpl;

import org.apache.ibatis.session.SqlSession;

import kr.co.dong.DAO.movieDAO;
import kr.co.dong.DTO.movieDTO;

public class movieDAOImpl implements movieDAO{

	private SqlSession sqlSession;
	private String namespace = "kr.co.dong.movieMapper";
	
	@Override
	public int search(String m_name) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".search", m_name);
	}

	@Override
	public movieDTO detail(int m_number) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".detail", m_number);
	}

}
