package com.winter.logtest.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	private int id;
	
	@NotBlank(message = "username은 공백일 수 없습니다.")
	@Size(max = 10, message = "username의 길이가 10자를 초과할 수 없습니다.")
	private String username;
	
	@NotBlank(message = "password가 공백일 수 없습니다.")
	private String password;
	
	@NotBlank(message = "email은 공백일 수 없습니다.")
	@Email
	private String email;
}
