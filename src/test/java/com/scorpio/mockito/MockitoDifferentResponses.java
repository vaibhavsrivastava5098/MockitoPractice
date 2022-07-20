package com.scorpio.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDifferentResponses {

	interface SomeMock {
		String toBeMocked();
	}

//	@Before
//	public void createMocks() {
//		MockitoAnnotations.initMocks(this);
//	}

	@Mock
	private SomeMock someMock;

	@Test
	public void testDifferentRsp() {
		when(someMock.toBeMocked()).thenReturn("Value1", "Value2", "Value3");

		String firstResponse = someMock.toBeMocked();
		String secondResponse = someMock.toBeMocked();
		String thirdResponse = someMock.toBeMocked();

//		System.out.println("First Response: "+firstResponse);
//		System.out.println("Second Response: "+secondResponse);
		assertEquals("Value1", firstResponse);
		assertEquals("Value2", secondResponse);
		assertEquals("Value3", thirdResponse);

	}
}
