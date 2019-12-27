package com.town.jgjgsximplementpublish.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.town.jgjgsximplementpublish.dao.JgJgsxImplementPublishDao;
import com.town.jgjgsximplementpublish.service.JgJgsxImplementPublishService;
import org.springframework.stereotype.Service;


/**
 * -Service实现
 * @author 
 * @since 2019-09-05
 */
@Service
public class JgJgsxImplementPublishServiceImpl implements JgJgsxImplementPublishService {
	
	@Resource
	private JgJgsxImplementPublishDao dao;



	@Override
	public int getSum() {
		return dao.getSum();

	}

	@Override
	public int getUnionSum() {
		return dao.getUnionNum();
	}

	@Override
	public List getPublishList() {
		return dao.getPublishList();
	}

}
