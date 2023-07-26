package kr.co.dong.DAO;

import java.util.List;

import kr.co.dong.DTO.boardDTO;

public interface boardDAO {
   public List<boardDTO> create();
   public List<boardDTO> read(int b_number);
   public int update(boardDTO bb);
   public int delete(int b_number);
   public List<boardDTO> listAll();
   
}