package com.myjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {
	MyJunit  junit = new MyJunit();
	@Test
	public void Addtest() {
		// Crating an object of class
		
		int result = junit.add(30, 6);
		assertEquals(36, result);
		
	}
	@Test
	public void Addtest2() {
		// Crating an object of class
		
		int result = junit.add(30, 6);
		assertEquals(36, result);
		
	}

}
