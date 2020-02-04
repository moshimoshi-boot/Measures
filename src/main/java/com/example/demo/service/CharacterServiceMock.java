package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.mapper.CharacterMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CharacterServiceMock implements CharacterService {

	private final CharacterMapper charactersMapper;

	public List<CharacterEntity> selectCharacters() {
		return charactersMapper.selectCharacterList(null);
	}

	public List<CharacterEntity> selectCharacters(String typeId) {
		return charactersMapper.selectCharacterList(typeId);
	}

}
