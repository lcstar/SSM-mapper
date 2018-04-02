package com.lc.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.mapper.DemoMapper;
import com.lc.model.Demo;
import com.lc.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	DemoMapper demoMapper;
	
	@Override
	public String addDemo() {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.setName("demo");
		demo.setCreateTime(new Date());
		demoMapper.insert(demo);
		return "SUCCESS";
	}

}
