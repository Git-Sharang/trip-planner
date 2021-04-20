# Trip Planner Application

It is built on JSP pages and the backend conists of JPA Hybernate which communicates with MySQL

# For running the application

- Open the project in Eclipse
- In `application.properties` change the database username and password
- Change this from `spring.jpa.hibernate.ddl-auto=none` -> `spring.jpa.hibernate.ddl-auto=update` then it will automatically create the database tables from the entity classes
- The app will use `https://localhost:8083/`
