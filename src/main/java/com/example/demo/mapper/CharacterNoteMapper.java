package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CharacterNoteEntity;

@Mapper
@Component
public interface CharacterNoteMapper {

	List<CharacterNoteEntity> selectCharacterNoteList(@Param("typeId") String typeId, @Param("characterId") String characterId);
	void insertNote(
			@Param("typeId") String typeId,
			@Param("characterId") String characterId,
			@Param("noteContent") String noteContent
	);
	void updateNote(
			@Param("typeId") String typeId,
			@Param("characterId") String characterId,
			@Param("noteId") int noteId,
			@Param("noteContent") String noteContent
	);
	void deleteNote(
			@Param("typeId") String typeId,
			@Param("characterId") String characterId,
			@Param("noteId") int noteId
	);

}
