package com.crud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
public class Entidy {

	@Id
	@GeneratedValue
	private Long id;
	
	@Getter
	@Setter
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entidy(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Entidy() {
	}

	@Override
	public String toString() {
		return "Entidy [id=" + id + ", name=" + name + "]";
	}
	
	

}
