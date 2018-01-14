package com.skss.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestXmlMapper {
	
	
	public String getNameById(long id);
}
