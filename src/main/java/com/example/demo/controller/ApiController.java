package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.mapper.CharacterMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApiController {
	private final CharacterMapper charactersMapper;

	@RequestMapping(value="/")
	private String selectCharacters(){
		List<CharacterEntity> charactersList = charactersMapper.selectCharacterList();
		return charactersList.toString();
	}

}
