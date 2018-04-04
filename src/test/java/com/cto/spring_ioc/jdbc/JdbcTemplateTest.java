package com.cto.spring_ioc.jdbc;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cto.spring_ioc.BaseTestCase;
import com.cto.spring_ioc.entity.City;

public class JdbcTemplateTest extends BaseTestCase {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void testQueryForSystemObject() {
		Long result = jdbcTemplate.queryForObject("select count(1) from city ", Long.class);
		assertTrue(result > 0);
	}
	
	@Test
	public void testQueryForObject() {
		String querySql = "select id,name,countryCode,district,population from city where id = ?";
		RowMapper<City> rowMapper = new BeanPropertyRowMapper<>(City.class);
		City city = jdbcTemplate.queryForObject(querySql, rowMapper,1);
		assertTrue("Kabul".equals(city.getName()));
	}

}
