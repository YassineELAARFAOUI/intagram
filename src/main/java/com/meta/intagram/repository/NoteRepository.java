package com.meta.intagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meta.intagram.models.Note;

public interface NoteRepository extends JpaRepository <Note,Integer>{
	
}
