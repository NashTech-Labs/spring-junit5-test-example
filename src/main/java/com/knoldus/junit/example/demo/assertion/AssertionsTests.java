package com.knoldus.junit.example.demo.assertion;


import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

@RunWith(JUnitPlatform.class)
public class AssertionsTests {

	@Test
	public void standardAssertions() {
		assertEquals(2, 2);
		assertEquals(String.valueOf(4), 4,
				"The optional assertion message is now the last parameter.");
	}

	@Test
	public void groupedAssertions() {
		assertAll("address", () -> assertEquals("Deepak", "Deepak"),
				() -> assertEquals("User", "User"));
	}

	@Test
	public void exceptionTesting() {
		Throwable exception = assertThrowsExactly(IllegalArgumentException.class,
				() -> {
					throw new IllegalArgumentException("a message");
				});
		assertEquals("a message", exception.getMessage());
	}
}
