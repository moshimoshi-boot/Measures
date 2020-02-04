package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CharacterEntity;

public interface CharacterService {

	public List<CharacterEntity> selectCharacters();
	public List<CharacterEntity> selectCharacters(String typeId);

}
