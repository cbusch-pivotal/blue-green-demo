CI/CD with Cloud Foundry and Jenkins - Demonstration Flow Document

To prepare environment, see the following:

https://github.com/cbusch-pivotal/pcf-immersion/tree/master/continuous-delivery
https://github.com/cf-platform-eng/cf-community-workshop/blob/master/demos/continuous-delivery-lab.adoc

Example blue-green application can be found at the following link. Absolutely fork it for your own use and point Jenkins at your fork so when updates occur, they occur off your work. This is a gradle-based app to be imported into STS. Install the Pivotal Cloud Foundry plug-in for Eclipse to push the application during testing.

https://github.com/cbusch-pivotal/blue-green-demo

Startup:
1 - Chrome with:
	- (Github)  https://github.com/cbusch-pivotal/blue-green-demo
	- (PWS)     https://console.run.pivotal.io
	- (local)   http://localhost:8080
	- (Jenkins) https://cbuschpivotal.ci.cloudbees.com (jenkins/{CloudFoundry})

2 - STS - workspace-demo (imported blue-green-demo with CF enabled)

3 - Github for commit and sync


Demonstration steps:
1. Show STS environment - developer activities
	a. run application with locally with Spring Boot and show app
	b. push application to PWS to test running on PCF and show app

2. Show github environment (web and Mac OS X app)

3. In STS,
    3a. change html header and footer tags to use “green”
    3b. build and run locally to check out
    3c. push to CF

4. It’s running, use GITHUB to commit and sync

5. Jump to Jenkins to
	a. watch build and deploy kick-off
	b. show console

6. Show PWS console how apps are updating

7. Show new “green” app from PWS console

8. Jenkins
	a. show history of build
	b. show job details
