Getting Started Guide
---------------------
https://jersey.java.net/documentation/latest/getting-started.html

Generating Grizzly2
-------------------
	mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 \
	-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
	-DgroupId=com.crittercism.recruiting.rest -DartifactId=api-server -Dpackage=com.crittercism.recruiting.rest \
	-DarchetypeVersion=2.9.1

Generating Web App
------------------
	mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp \
	-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
	-DgroupId=com.crittercism.recruiting.rest -DartifactId=api-server -Dpackage=com.crittercism.recruiting.rest \
	-DarchetypeVersion=2.9.1

To Run
------
	mvn jetty:run

To Run Health Check
-------------------
	curl http://localhost:8080/api-server/healthcheck

