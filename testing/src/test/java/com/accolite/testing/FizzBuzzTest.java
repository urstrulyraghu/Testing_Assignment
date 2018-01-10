package com.accolite.testing;

import static org.junit.Assert.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	static Logger logger;

	
	@BeforeClass
	public static void beforeFizzBuzz() {
		System.out.println("Entering Fizz Buzz Test Cases!");
	}
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
		logger = Logger.getLogger(FizzBuzz.class);
		BasicConfigurator.configure();
		logger.info("Started tests");
	}
	
	@Test
	public void testPlay() {
		fizzBuzz.setLimit(15);
		String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		try{
			assertArrayEquals(expected, fizzBuzz.play());
			logger.info("Test Succesfull");
		}catch(Exception e){
			logger.error("Test Failed " + e.getMessage());
		}
	}
	
	@Test(expected=NegativeArraySizeException.class)
	public void testInvalidInput(){
		try{
			fizzBuzz.setLimit(-15);
			fizzBuzz.play();
			logger.info("Test Successfull");
		}catch(Exception e) {
			logger.error("Test failed " + e.getMessage());
		}
	}
	
	@After
	public void afterTests() {
		logger.info("Finished Test Cases:");
	}
	
}
