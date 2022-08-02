package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class TestdemoApplicationTests {


	@InjectMocks
	CalculatorServiceImpl mathApplication = new CalculatorServiceImpl();

	@Mock
	CalculatorService calcService;

	@Test
	public void addTest() {

		when(calcService.add(10.0,20.0)).thenReturn(30.00);

		Assertions.assertThat(mathApplication.add(10.0, 20.0)).isEqualTo(30.0);

	}

	@Test
	public void subtractTest(){

		when(calcService.subtract(50.0,30.0)).thenReturn(20.0);

		Assertions.assertThat(mathApplication.subtract(50.0,30.0)).isEqualTo(20.0);
	}

	@Test
	public void multiplyTest(){

		when(calcService.multiply(5.0,2.0)).thenReturn(10.0);

		Assertions.assertThat(mathApplication.multiply(5.0,2.0)).isEqualTo(10.0);
	}
	@Test
	public void divideTest(){

		when(calcService.divide(10.0,2.0)).thenReturn(5.0);

		Assertions.assertThat(mathApplication.divide(10.0,2.0)).isEqualTo(5.0);
	}

}
