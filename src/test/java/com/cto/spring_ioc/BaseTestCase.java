package com.cto.spring_ioc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath*:applicationContext-*.xml" })
public class BaseTestCase extends TestCase {
	
	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataSource() throws SQLException {
		assertThat(dataSource, is(notNullValue()));
		assertThat(dataSource.getConnection(), is(notNullValue()));
	}

}
