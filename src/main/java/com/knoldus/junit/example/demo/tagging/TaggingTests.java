package com.knoldus.junit.example.demo.tagging;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fast")
@Tag("model")
@RunWith(JUnitPlatform.class)
class TaggingTests {

	@Test
	@Tag("taxes")
	void testingTaxCalculation(TestInfo testInfo) {
		assertTrue(testInfo.getTags().contains("taxes"));
	}

	@Test
	@Tag("income")
	void testingIncomeCalculation() {
	}

}