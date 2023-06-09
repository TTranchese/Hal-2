package com.example.Hal2;

import jakarta.persistence.*;

@Entity
@Table(name = "programming_languages")
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	private int firstAppearance;
	@Column(nullable = false)
	private String inventor;
	
	public ProgrammingLanguage() {
	}
	
	public ProgrammingLanguage(int id, String name, int firstAppearance, String inventor) {
		this.id = id;
		this.name = name;
		this.firstAppearance = firstAppearance;
		this.inventor = inventor;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFirstAppearance() {
		return firstAppearance;
	}
	
	public void setFirstAppearance(int firstAppearance) {
		this.firstAppearance = firstAppearance;
	}
	
	public String getInventor() {
		return inventor;
	}
	
	public void setInventor(String inventor) {
		this.inventor = inventor;
	}
}
