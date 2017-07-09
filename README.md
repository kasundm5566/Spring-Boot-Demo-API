# Spring-Boot-Demo-API
Simple REST API developed using Spring Boot to implement basic CRUD operations.

### Pre-requisites
---
- Java Development Kit (JDK) 1.8
- MongoDB 3.4
- Apache Maven 3.3

### Configurations
---
- You may find the configuration file for this Spring Boot API in the `application.yaml` file in the **resources** direcotry.
It has already defined the configurations required for the MongoDB database connectivity.
- Server starting port is 5000.
- Server context path in `/api/v1`. That means if you want to access a particular service you need to do it as follows.
    - <host>:<server_port>/<context_path>/<service_path>
    - e.g: localhost:5000/api/v1/students/john123

### Restore database.
---
- This API accesses a MongoDB database.
- Name of the database is **school**.
- Name of the collection (similar to MySQL table) is **student**.
- Files required for the database restoration is available in the directory **db_backups**.
    - dump directory: Contains the full database dump that can be used to restore using `mongorestore`.
    - Help.txt: Contains the query to insert data to the collection.
    - dbdata.json: Contains the collection data used to execute the query mentioned in the Help.txt file.
    - database_dump.json: Contains the data of the student collection exported using `mongoexport`.
