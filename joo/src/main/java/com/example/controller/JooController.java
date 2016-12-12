package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JooController {
	
//	@RequestMapping(value="/board", method = RequestMethod.GET)
//	//@GetMapping("/board")
//    public String jorugi() {	
//    	return  "hello";
//    }
	
    @RequestMapping("/jorugi")
    public String jorugi(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    
	@RequestMapping(value="/api/moveJorugiBoard", method = RequestMethod.GET)
    public String moveJorugiBoard() {		
    	return  "board/board_main";
    }


}
