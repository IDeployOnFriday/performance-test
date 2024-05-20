Performance Testing Java local V DB
=======================

This is simple performance test for Java. 
There is a main class which will calculate pi to x number of places. allowing performance testing. 



The structure ``HelloWorld`` package is like this: ::

  example.java.helloworld/
  |-- HelloWorld
  |   `-- Main.java
  |-- LICENSE
  |-- Manifest.txt
  `-- README.md

Compile class
-------------

For compile the main class for package, execute the follow command: ::

  javac HelloWorld/Main.java

This generate the ``Main.class`` file into ``HelloWorld`` directory.

Create a JAR file
-----------------

For pack the main class for package as a JAR file, execute the follow command: ::

  jar cfme Main.jar Manifest.txt HelloWorld.Main HelloWorld/Main.class


Run a JAR file
--------------

For run the JAR file packed, execute the follow command: ::

  java -jar Main.jar 1000

This show the how long it takes to calculate pi to 100 places 


Run On DB 
--------------

CREATE OR REPLACE PACKAGE my_function.timeme
AS 
FUNCTION pi(Num in String) return VARCHAR;
END;
/


CREATE OR REPLACE PACKAGE BODY my_function.timeme
AS
FUNCTION pi(Num in String) RETURN VARCHAR2 AS LANGUAGE JAVA NAME 'HelloWorld.pi(java.lang.String)' return java.lang.String';
END;
/ 
