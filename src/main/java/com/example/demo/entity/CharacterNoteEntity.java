package com.example.demo.entity;

import lombok.Data;

@Data
public class CharacterNoteEntity {

	private String gameTypeId;
	private String characterId;
	private int noteId;
	private String noteContent;

}
