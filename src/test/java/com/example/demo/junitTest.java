package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class junitTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void unitTest() {
		assertEquals("1", "1"); // 첫 번째 값과 두 번째 값이 같은지 확인
		assertNotNull(new ArrayList<String>()); // 객체가 null이 아닌지 확인
	}

	@Test
	public void getMyDefault() {
		Optional<String> optional = Optional.empty();
		System.out.println(optional); // Optional.empty
		System.out.println(optional.isPresent()); // false

		Optional<String> test = Optional.ofNullable(null);
		String name = test.orElse("anonymous");
		System.out.println(name);

	}

}
