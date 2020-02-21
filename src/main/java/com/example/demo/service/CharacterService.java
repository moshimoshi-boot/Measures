package com.example.demo.service;

import java.util.List;

import com.example.demo.Bean.CharacterNoteBean;
import com.example.demo.entity.CharacterEntity;
import com.example.demo.entity.CharacterNoteEntity;

public interface CharacterService {

	public List<CharacterEntity> selectCharacters();
	public List<CharacterEntity> selectCharacters(String typeId);
	public List<CharacterNoteEntity> selectCharacterNotes(String typeId, String characterId);
	public void insertNote(CharacterNoteBean bean);
	public void updateNote(CharacterNoteBean bean);
	public void deleteNote(CharacterNoteBean bean);

}
