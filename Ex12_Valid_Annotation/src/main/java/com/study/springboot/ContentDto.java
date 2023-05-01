package com.study.springboot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

// lombok을 통해서 메소드(getter, setter 등등 자동 생성)
@Data
public class ContentDto {

	private int id;
	
	@NotBlank(message="writer가 null, '', ' '중에 하나입니다.")
	@Size(min=3, max=10, message="writer의 길이가 3~10글자여야 합니다.")
	private String writer;
	
	@NotEmpty(message="content가 null, ''중에 하나입니다.")
	private String content;
	
}
