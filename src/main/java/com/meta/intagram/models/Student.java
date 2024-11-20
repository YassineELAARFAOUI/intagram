package com.meta.intagram.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cie;
	@Column(name="fullName",nullable=false,length=100)
	private String fullName;
	@Column(name="email",nullable=false,length=100)
	private String email;
   @OneToMany(mappedBy="student",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Note> notes =new ArrayList<>();
	public void voirNote() {
		System.out.println("this is your result mark");
	}

}
