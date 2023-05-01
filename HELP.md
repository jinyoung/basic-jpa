# Getting Started


```
http :8080/members name="신창섭" address[city]="서울"

http http://localhost:8080/memberAudits member="http://localhost:8080/members/1" operation="CREATE" date="2023-05-01"

http "http://localhost:8080/memberAudits/2/member"
http "http://localhost:8080/members/1/history"

http PUT "http://localhost:8080/members/1/deactivate"

http "http://localhost:8080/members/1/history"

```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.12-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.12-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.7.12-SNAPSHOT/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.12-SNAPSHOT/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/2.7.12-SNAPSHOT/reference/htmlsingle/#web.spring-hateoas)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)

