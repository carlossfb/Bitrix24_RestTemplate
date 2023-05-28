# Getting Started

### Compile application

```bash
    mvn clean package
```

### Create a docker image from Dockerfile

```bash
    docker build  -t bitrix24-consume_api:1.0.0 .
```
### Run application

```bash
    docker run --name bitrix24 -p 8080:8080  -d bitrix24-consume_api:1.0.0
```

## Endpoints

### /api/

Returns departaments of the Bitrix24 account.

```json
    {
        "result": [
            {
            "ID": "1",
            "NAME": "Bitrix"
            },
            {
            "ID": "3",
            "NAME": "Accounts Department"
            },
            {
            "ID": "5",
            "NAME": "Sales Department"
            },
            {
            "ID": "7",
            "NAME": "T.I"
            }
        ]
    }
```

### /api/department/{id}

Returns users of department and his tasks of Bitrix24.
```json
    {
        "result": [
            {
            "task": [
                
            ],
            "ID": "5",
            "NAME": "User_name",
            "LAST_NAME": "2",
            "EMAIL": "email@gmail.com"
            }
        ]
    }
```


### Create a build for Dockerfile (Example POM)
```xml
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
		<finalName>application</finalName> *Name of JAR file*
	</build>
```

#### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#using.devtools)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#web.spring-hateoas)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
