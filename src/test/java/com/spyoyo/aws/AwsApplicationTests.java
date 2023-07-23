package com.spyoyo.aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AwsApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertNotNull(Integer.valueOf(1), "The Integer 1 should not be null");
	}

}
