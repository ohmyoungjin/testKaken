package net.hb.crud;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	ServletContext application;
	
	
	@Autowired
	BoardDAO dao;
	@RequestMapping(value = "/boardWrite.do", method = RequestMethod.GET)
	public String board_write() {	
		return "boardWrite";
	}
	
}//class end
