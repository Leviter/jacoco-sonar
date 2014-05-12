 jacoco-sonar
============

Running only unit tests:
``mvn clean package``
(or any other lifecycle stage before the integration-test phase)

Running integration tests as well:
``mvn clean install``
(or any other lifecycle stage after the integration-test phase, or the integration-test phase itself)
