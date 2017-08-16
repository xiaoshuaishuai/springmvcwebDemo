package com.xs.webtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xs.webtest.dao.IPeopleDao;
import com.xs.webtest.domain.People;
@Service
public class PeopleServiceImpl implements IPeopleService{
	@Autowired
	IPeopleDao peopleDao;
	
	public List<People> list() {
		return peopleDao.list();
	}

}
