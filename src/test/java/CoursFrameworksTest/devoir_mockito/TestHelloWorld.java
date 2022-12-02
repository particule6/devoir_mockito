package CoursFrameworksTest.devoir_mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class TestHelloWorld {

	@Test
	public void testStringHelloWorld() {
		HelloWorld stringHelloWorld = new HelloWorld();
		HelloWorld mockSHW = Mockito.mock(HelloWorld.class);
		
		assertEquals("Hello World", stringHelloWorld.stringHelloWorld());
		
		when(mockSHW.stringHelloWorld()).thenReturn("My name is Antoine");
		assertEquals("My name is Antoine", mockSHW.stringHelloWorld());
		
		verify(mockSHW).stringHelloWorld();
	}

}
