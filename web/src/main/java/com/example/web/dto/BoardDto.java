package com.example.web.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Timestamp regdate;
}
