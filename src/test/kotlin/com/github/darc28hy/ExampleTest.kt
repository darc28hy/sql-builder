package com.github.darc28hy

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleTest {

	@Test
	fun test1() {
		assertEquals(1, 1)
	}

	@Test
	fun test2() {
		val result = Example().greet("test")
		assertEquals("Hello, test", result)
	}
}