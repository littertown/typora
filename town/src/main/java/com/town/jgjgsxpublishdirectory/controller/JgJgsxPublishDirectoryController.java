package com.town.jgjgsxpublishdirectory.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.town.jgjgsxpublishdirectory.service.JgJgsxPublishDirectoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * -Controller
 * @author 
 * @since 2019-09-05
 */
@Controller
@RequestMapping(value = "/public/jgjgsxpublishdirectory")
public class JgJgsxPublishDirectoryController  {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	private JgJgsxPublishDirectoryService service;


}
