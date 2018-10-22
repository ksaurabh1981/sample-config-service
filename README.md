# sample-config-service
This will have different sample module to configure spring-cloud config server.
### Module
* config-service-client : This is client application to access config server to fetch configurations.
* config-service-git : This sample application is fetching configuration file from github repo.
* config-service-file :
* config-service-classpath :
* config-service-discovery :
* discovery-service

## Fetching configuration from github repo:
1. config-service-git module configure to fetch configuration from github repo https://github.com/ksaurabh1981/sample-config-properties.git. This configuration in mention in application.yml file.
To run config-service-git module go to config-service-git directory and run below command
```
$ mvn spring-boot:run
```
this command will start application listing on port 8881. To verify sever is started call below URL
```
http://localhost:8881/sample-config/default
http://localhost:8881/service1-config/default
```
2. Run config-service-client module and call below url
```
http://localhost:8081/testConfig
```
you will see output from two config file sample-config.properties and service1-config.properties.
```
Output : welcome to centralized config file. This message is for service1
```
