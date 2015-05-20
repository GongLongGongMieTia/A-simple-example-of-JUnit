package com;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	Calculate ca;
	
	@Before
	public void setUp(){
		ca = new Calculate();
	}

	@Test
	public void testAdd(){
		double res = ca.add(12.0, 13.0);
		Assert.assertEquals("Add method has a problem", res, 25.0);
	}

	@Test
	public void testMin(){
		double res = ca.min(12.0, 13.0);
		Assert.assertEquals("Add method has a problem", res, -1.0);
	}

	@Test
	public void testMul(){
		double res = ca.mul(2.0, 3.0);
		Assert.assertEquals("Add method has a problem", res, 6.0);
	}

	@Test
	public void testDev(){
		double res = ca.dev(12.0, 2.0);
		Assert.assertEquals("Add method has a problem", res, 6.0);
	}
}
