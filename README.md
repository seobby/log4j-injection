## log4j-injection
- A malicious LDAP server for JNDI injection attacks. 
- A Simple Application server

### Description
* log4j injection 이슈를 정리하고자 본 프로젝트를 생성하였음 


### Usage
LDAP Server 실행하기 
```
$ java -jar ldap-server/target/ldap-server-1.0-SNAPSHOT.jar
```


### Example:
```
$ java -jar ldap-server/target/ldap-server-1.0-SNAPSHOT.jar
LADP Server ldap.Starter
Starting LDAP server on 0.0.0.0:1389
Mapping ldap://127.0.0.1:1389/o=macos to ldap.controllers.MacOs
```


### Building
Java v1.7+ and Maven v3+ required
```
mvn package
```
