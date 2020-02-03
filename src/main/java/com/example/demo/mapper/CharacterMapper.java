package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CharacterEntity;

@Mapper
@Component
public interface CharacterMapper {

	List<CharacterEntity> selectCharacterList();

}
