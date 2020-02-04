package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.constant.PathConstant;

@Controller
public class DisplayController {

	@RequestMapping(value="/")
	private String display() {
		return PathConstant.DISPLAY;
	}

}
