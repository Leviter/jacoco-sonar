package org.theblackproject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorld {

	public void coveredByUnitTest() {
		log.info("coveredByUnitTest1");
		log.info("coveredByUnitTest2");
	}

	public void coveredByIntegrationTest() {
		log.info("coveredByIntegrationTest1");
		log.info("coveredByIntegrationTest2");
		log.info("coveredByIntegrationTest3");
	}

	public void notCovered() {
		log.info("notCovered");
	}

}
