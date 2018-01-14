package com.skss.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.skss.demo.mapper.TestXmlMapper;
import com.skss.demo.redis.RedisCache;
import com.skss.demo.stub.DubboService;

@Service(version = "1.0.0")
public class DubboServiceImpl implements DubboService {

	@Autowired
	private TestXmlMapper testXmlMapper;

	@Autowired
	private RedisCache redisCache;

	@Override
	public String getNameByIdForXml(long id) {
		String name = testXmlMapper.getNameById(id);
		return name;
	}

	@Override
	public String getNameByIdForAnnotation(long id) {
		String name = testXmlMapper.getNameById(id);
		return name;
	}

	@Override
	public void redisSet(String key, String value) {
		redisCache.set(key, value);

	}

	@Override
	public String redisGet(String key) {
		return redisCache.get(key);
	}

}
