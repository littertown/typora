package com.town.jgjgsxpublishsundetail.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.town.jgjgsxpublishsundetail.service.JgJgsxPublishSunDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * -Controller
 * @author 
 * @since 2019-09-05
 */
@Controller
@RequestMapping(value = "/public/jgjgsxpublishsundetail")
public class JgJgsxPublishSunDetailController {
	@Resource
	private JgJgsxPublishSunDetailService service;


}
