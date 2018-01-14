package com.skss.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestAnnotationMapper {

	@Select("select name from id = #{id}")
	public String getNameById(long id);
}
