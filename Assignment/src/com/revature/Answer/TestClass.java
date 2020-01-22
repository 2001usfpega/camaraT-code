package com.revature.Answer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {
	
	
        
	@Test
	void bubbleSort() {
		int [] array= {1,2,3};
	
		int[] resutlArray=Q1Solved.bubbleSort(array);
		
				assertEquals(array, resutlArray);
		
	}

}
