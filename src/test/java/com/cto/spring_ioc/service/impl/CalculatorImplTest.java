package com.cto.spring_ioc.service.impl;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cto.spring_ioc.BaseTestCase;
import com.cto.spring_ioc.srevice.Calculator;

public class CalculatorImplTest extends BaseTestCase {
	
	private Logger logger = LoggerFactory.getLogger(CalculatorImplTest.class);
	
	@Autowired
	private Calculator calculator;
	
	@Test
	public void testAdd() {
		int result = calculator.add(1, 3);
		logger.info("The result is " + result);
		assertThat(result,is(4));
	}

}
