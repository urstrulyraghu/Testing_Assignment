package com.accolite.testing;

/**
 * Hello world!
 *
 */
public class FizzBuzz 
{
	int limit;
	
	
	public FizzBuzz() {
		super();
	}


	public FizzBuzz(int limit) {
		this.limit = limit;
	}
	
	
	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public String[] play() {
		int i = 1;
		String[] result = new String[limit];
		while(i  <= limit) {
			if(i % 3 == 0 &&  i % 5 == 0)
				result[i - 1] = "FizzBuzz";
			else if( i % 3 == 0)
				result[i - 1] = "Fizz";
			else if(i % 5 == 0)
				result[i - 1] = "Buzz";
			else
				result[i - 1] = new Integer(i).toString();
			i++;

		}
		return result;
	}
}
