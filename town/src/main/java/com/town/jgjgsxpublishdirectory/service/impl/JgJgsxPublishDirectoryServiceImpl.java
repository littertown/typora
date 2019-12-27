package com.town.jgjgsxpublishdirectory.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.town.jgjgsxpublishdirectory.dao.JgJgsxPublishDirectoryDao;
import com.town.jgjgsxpublishdirectory.service.JgJgsxPublishDirectoryService;
import org.springframework.stereotype.Service;

/**
 * -Service实现
 * @author 
 * @since 2019-09-05
 */
@Service
public class JgJgsxPublishDirectoryServiceImpl  implements JgJgsxPublishDirectoryService {
	
	@Resource
	private JgJgsxPublishDirectoryDao dao;
	

}
