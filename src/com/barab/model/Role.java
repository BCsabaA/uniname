package com.barab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	private Long id;
	private String name;
	
	@Override
	public String toString() {
		return "role [id=" + id + ", name=" + name + "]";
	}
	
}
