package integrationtest;

import org.junit.Test;
import org.theblackproject.HelloWorld;

public class HelloWorldIT {
	@Test
	public void test() {
		new HelloWorld().coveredByIntegrationTest();
	}
}
