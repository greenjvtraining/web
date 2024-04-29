package com.example.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.web.dto.BoardDto;

@Mapper
public interface IBoardDao {
	
	public List<BoardDto> getList();
}
