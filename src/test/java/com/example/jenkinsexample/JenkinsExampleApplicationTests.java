package com.example.jenkinsexample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsExampleApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTopla()
	{
		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		int sayi1 = 5;
		int sayi2 = 19;

		int toplam = hesapMakinesi.topla(sayi1,sayi2);

		Assert.assertEquals(24, toplam);
	}

}