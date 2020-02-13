package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CharacterEntity;
import com.example.demo.service.CharacterService;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
public class ApiController {

	private CharacterService characterService;

	@RequestMapping(value="/characters/json")
	private List<CharacterEntity> getCharactersJson(){
		return characterService.selectCharacters();
	}

}
