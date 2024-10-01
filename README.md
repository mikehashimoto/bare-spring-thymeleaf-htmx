# bare-spring-thymeleaf-htmx
Minimal code needed to create a Spring Boot Application with Thymeleaf &amp; HTMX

## Basic Requirements

-   Must have Java JDK 11 or higher installed

## Start Up Spring Boot

In order to start the server run the following command:
`bare-spring-thymeleaf> ./gradlew bootRun`

After startup, the following message will be displayed:

```
> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.2)

2024-02-22T23:25:01.978-08:00  INFO 82186 --- [           main] com.example.BareApplication              : Starting BareApplication using Java 21.0.2 with PID 82186 (/opt/dev/projects/github/bare-spring-thymeleaf/build/classes/java/main started by michaelhashimoto in /opt/dev/projects/github/bare-spring-thymeleaf)
2024-02-22T23:25:01.980-08:00  INFO 82186 --- [           main] com.example.BareApplication              : No active profile set, falling back to 1 default profile: "default"
2024-02-22T23:25:02.316-08:00  INFO 82186 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-02-22T23:25:02.322-08:00  INFO 82186 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-02-22T23:25:02.322-08:00  INFO 82186 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.18]
2024-02-22T23:25:02.342-08:00  INFO 82186 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-02-22T23:25:02.342-08:00  INFO 82186 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 344 ms
2024-02-22T23:25:02.383-08:00  INFO 82186 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2024-02-22T23:25:02.482-08:00  INFO 82186 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2024-02-22T23:25:02.486-08:00  INFO 82186 --- [           main] com.example.BareApplication              : Started BareApplication in 0.648 seconds (process running for 0.776)
```

To access this server hit http://localhost:8080/. To see the HTMX interactions click the "Click Me" button.

## Additional Notes

- This repository was built off of https://github.com/mikehashimoto/bare-spring-thymeleaf with added HTMX functionality
- The default location to put Thymeleaf templates is in `src/main/resources/templates`
- The default location to put Java Classes is in `src/main/java/`

## Additional Resources

- For more information on Spring Boot: https://spring.io/projects/spring-boot/
- For more information on Thymeleaf: https://www.thymeleaf.org/
- For more infomration on HTMX: https://htmx.org/