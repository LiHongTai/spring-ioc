package com.cto.spring_ioc.srevice.impl;

import com.cto.spring_ioc.srevice.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		return i - j;
	}

	@Override
	public int mul(int i, int j) {
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		return i/j;
	}

}
