package com.web.crawler;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpiderTest {

	private static Spider spider;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		spider = new Spider();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testSpider() {

	      spider.search("http://wiprodigital.com");
	}

}
