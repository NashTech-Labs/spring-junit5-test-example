package com.knoldus.junit.example.demo.standard;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class StandardTests {

	@BeforeAll
	static void setup() {
		System.out
				.println("@BeforeAll - Execute once before all test methods in this class.");
	}

	@BeforeEach
	void init() {
		System.out
				.println("@BeforeEach - Executed before each test method in this class.");
	}

	@DisplayName("First Test")
	@Test
	void firstTest() {
		assertEquals(1, 1);
	}

	@Test
	@Disabled("Not implemented yet.")
	void disabledTest() {
	}

	@Test
	@DisplayName("😱")
	void testWithDisplayNameContainingEmoji() {
		/**
		 * http://getemoji.com/
		 */
	}

	@AfterEach
	void tearDown() {
		System.out
				.println("@AfterEach - This method is called after each test method.");
	}

	@AfterAll
	static void done() {
		System.out
				.println("@AfterAll - This method is called after all test methods.");
	}

}