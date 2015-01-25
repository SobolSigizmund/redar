Project Redar
==============
Project Redar is a personal project for practicing, proof of concept of my ideas of solution for some real problems.

Modules
--------

###1. Multi-Threading examples

####1.1 ThreadLocals + ThreadPools

This module is to test about the Memory Leak Protection by making sure to remove the ThreadLocal conext at the end of
Runnable execution

####1.2. Fork And Join

This module is to test about the Fork And Join

####1.3. Inter-JVM Syncronization using Semaphore through RMI

This module is to illustrate the use of  Semaphore based pass manager running in RMI to control the syncronziation among multiple JVMs.

####1.4 Blocking Queue based Publisher-Topic Borker-Subcriber Pattern for Order Management System

This module is to implement a high through-put Order Management System. Blocking Queue based Publisher - Broker - Subscriber pattern is used.

Each order is sent to a Topic whose id is the Order Id.

_____________________________________________________________



###2. Integration Tools

####2.1 Message Queue Router

This module is to use Spring Integration to implement a message content based MQ router. Message received from a remote queue
will be routed to different destination queues based on the preconfiged keywords mapping.



####2.2. MQ-based File Sender
This module is to illustrate sending File binaries(. e.g image file) using file mq. File Name is preserved by using MQ header properties.

####2.3. File Monitor Implementations
This module provides the implementation of File Minitor that monitors a file directory for changes. And provides
comparision between Apache Commons-IO based FileAlterationMonitor and JDK7 provided WatcherService.

**Conclusion:** File WatcherService in JDK provides more accurate Event monitoring.


____________________________________________________________________________


###3. Inter Process ( JVM) Commnication Tools

####3.1. Inter Process(JVM) Commnunication - RMI

This module is test the performance for using RMI to achive JVM to JVM communication. Spring Remoting is used to setup
RMI communications.

####3.2 Inter Process(JVM) Commnunication - IO/NIO Sockets

This module is to test the performance for using simple socket to achive JVM to JVM Communication.

Both IO based and NIO based sockets are used for comparasion.


####3.3. Inter Process(JVM) Commnunication - MQ or ZeroMQ based

This module is to test the performance for using in memory MQ , ZeroMQ to achive JVM to JVM Communication.

jeromq is used.

####3.4. Inter Process(JVM) Commnunication - Memory Mapped File Based (NIO based) Java Socket

jocket the the library used. Fantasitc result.

####3.5. Inter Process(JVM) Commnunication - Named Pipes - Memory Mapped File

unix-based named Pipes, i.e. Memory Mapped File, Fantastic result


________________________________________________________________________


###4. Batch Engine - Java Schedulers

####4.1. Quartz Job Scheduler, Monitoring And Re-Triggering, With Quartz JDBC Job History Plugin
This is module is to provide a bootstrap for integrating quartz with Spring.

DBPersistentJobHistoryPlugin is implemented and used along with LoggingJobHistoryPlugin for recording down the Job Executions into DB.

**RMI Based** CommandLineApplication **MonitoringApp** is provided as an illustration on force executing an exisiting quartz job during runtime.

**Online Quartz Job Monitoring**.
mvn install tomcat7:run
[http://localhost:8080/jobs/history](http://localhost:8080/jobs/history)

____________________________________________________________________________

###5. Java Apache Mina based Networking Tools

####5.1 Mina TCP Server and Client

a python scripts, tcpclient.py is also included.

    python tcpclient.py -hn localhost -p <your port> -f <Your file path>


####5.2 Mina SFTP Server

A Local SFTP Server using Apache SSHD.

__________________________________________________________________________

###6. Design Pattern Example

This project covers:

    * Singleton Pattern
    * Factory Pattern
    * Command Pattern
    * Intepreter Pattern
    * Observer Pattern
    * Proxy Pattern
    * Adapter Pattern
    * Vistor Pattern
    * Producer-Consumer Pattern ( PriorityBlockingQueue is used)
    * Chain-of-Responsibility Pattern


-------------------------------------------------------------------------
###7. Java Project Build Tools

This project serves as study material for various build tools for java projects.

It covers:

     * Apache Ant build
     * Apahce Ant with Ivy as dependency management


####7.1 Ant as a building tool

You can just run the build tool inside each sub-projects

    ant
    ant junit junitreport

####7.2 Ant with Ivy

You can just run the build tool inside each sub-projects

    ant install main


Build And Usage
----------------

You can build as independent maven projects

    mvn install


###8. Spring Guides

This project is used as a demo and quick try for Spring related projects.

    - Authenticating-LDAP with Spring Security
    - Consuming-Rest with Spring RestTemplate
    - Data Access with Spring JdbcTemplate
    - Device-Dectection with Spring Mobile MVC
    - Messaging-JMS with Spring JmsTemplate
    - Messaging-Rabbitmq with Spring amqpTemplate
    - Messaging-Redis with redisTemplate
    - Rest-Service with Spring MVC Rest Controller
    - Scheduling-task with Schedule annotation. @Schedule annotation supports Cron for simple scheduling
    - Upload-File. Using Spring Multipart support to upload files.
    - Validating-form-input. using spring @Valid annotation and Hibernate validator.