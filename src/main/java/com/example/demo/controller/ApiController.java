package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.CharacterNoteBean;
import com.example.demo.entity.CharacterEntity;
import com.example.demo.entity.CharacterNoteEntity;
import com.example.demo.service.CharacterService;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/measures")
public class ApiController {

	private CharacterService characterService;

	@RequestMapping(value="/characters/json", method = RequestMethod.GET)
	private List<CharacterEntity> getCharactersJson(){
		return characterService.selectCharacters();
	}

	@RequestMapping(value="/characters/note/json", method = RequestMethod.GET)
	private List<CharacterNoteEntity> getCharacterNotes(
			@RequestParam String typeId,
			@RequestParam String characterId){
		return characterService.selectCharacterNotes(typeId, characterId);
	}

	@RequestMapping(value="/characters/note", method=RequestMethod.POST)
	private String insertNote(@RequestBody CharacterNoteBean bean) {
		characterService.insertNote(bean);
		return "ok";
	}

	@RequestMapping(value="/characters/note", method=RequestMethod.PUT)
	private String updateNote(@RequestBody CharacterNoteBean bean) {
		characterService.updateNote(bean);
		return "ok";
	}

	@RequestMapping(value="/characters/note", method=RequestMethod.DELETE)
	private String deleteNote(@RequestBody CharacterNoteBean bean) {
		characterService.deleteNote(bean);
		return "ok";
	}

}
