package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Bean.CharacterNoteBean;
import com.example.demo.entity.CharacterEntity;
import com.example.demo.entity.CharacterNoteEntity;
import com.example.demo.mapper.CharacterMapper;
import com.example.demo.mapper.CharacterNoteMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterServiceMock implements CharacterService {

	private final CharacterMapper charactersMapper;
	private final CharacterNoteMapper characterNoteMapper;

	@Override
	public List<CharacterEntity> selectCharacters() {
		return charactersMapper.selectCharacterList(null);
	}

	@Override
	public List<CharacterEntity> selectCharacters(String typeId) {
		return charactersMapper.selectCharacterList(typeId);
	}

	@Override
	public List<CharacterNoteEntity> selectCharacterNotes(String typeId, String characterId) {
		return characterNoteMapper.selectCharacterNoteList(typeId, characterId);
	}

	@Override
	public void insertNote(CharacterNoteBean bean) {
		characterNoteMapper.insertNote(bean.getGameTypeId(), bean.getCharacterId(), bean.getNoteContent());
	}

	@Override
	public void updateNote(CharacterNoteBean bean) {
		characterNoteMapper.updateNote(bean.getGameTypeId(), bean.getCharacterId(), Integer.parseInt(bean.getNoteId()), bean.getNoteContent());
	}

	@Override
	public void deleteNote(CharacterNoteBean bean) {
		characterNoteMapper.deleteNote(bean.getGameTypeId(), bean.getCharacterId(), Integer.parseInt(bean.getNoteId()));
	}

}
