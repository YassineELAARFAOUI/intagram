package com.meta.intagram.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="note")
public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IdNote;
	@Column(name="valeur",nullable=false)
	private double valeur;
	@Column(name="dateSaisie",nullable=false)
	private Date dateSaisie ;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id",nullable=false)
	@JsonIgnore
	private Student student;
	public void afficher() {
		System.out.println("you note is....");
	}
}
