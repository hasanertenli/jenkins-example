package com.example.jenkinsexample;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsExampleApplicationTests {

	public FizzBuzz fB;

	@BeforeEach
	public void setUp() {
		fB = new FizzBuzz();
	}

	@DisplayName("Play FizzBuzz with number = 1")
	@org.junit.jupiter.api.Test
	public void testNumber() {
		String fizzBuzz = fB.play(1);
		Assertions.assertEquals(fizzBuzz, "1");
	}

	@DisplayName("Play FizzBuzz with number = 3")
	@org.junit.jupiter.api.Test
	public void testFizz() {
		String fizzBuzz = fB.play(3);
		Assertions.assertEquals(fizzBuzz, "Fizz");
	}

	@DisplayName("Play FizzBuzz with number = 5")
	@org.junit.jupiter.api.Test
	public void testBuzz() {
		String fizzBuzz = fB.play(5);
		Assertions.assertEquals(fizzBuzz, "Buzz");
	}

	@DisplayName("Don't Play FizzBuzz with number = 0")
	@org.junit.jupiter.api.Test
	public void testZero() {

		Assertions.assertThrows(IllegalArgumentException.class,
				() -> fB.play(0));
	}

	@AfterEach
	public void tearDown() {
		fB = null;
	}

}
