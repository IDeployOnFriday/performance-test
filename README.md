performance
=======================

This is simple performance test for Java. 
There is a App class which will calculate pi to x number of places. allowing performance testing. 

# Compile class
```
javac --release=8 performance/App.java
```

This generate the ``App.class`` file into ``performance`` directory.

# Create a JAR file

```
jar cfme App.jar Manifest.txt performance.App performance/App.class
```

# Run a JAR file

```
java -jar App.jar 1000
```


# Run On Oracle 


-- load the jar into the db 


CREATE OR REPLACE PACKAGE my_function.pi
AS 
FUNCTION pi(Num in String) return VARCHAR;
END;
/


CREATE OR REPLACE PACKAGE BODY my_function.pi
AS
FUNCTION pi(Num in String) RETURN VARCHAR2 AS LANGUAGE JAVA NAME 'performance.App.pi(java.lang.String)' return java.lang.String';
END;
/ 

# Testing 

select my_function.pi('100000') from dual;

Time on db - 45 secs
Time locally - 0.7 secs 
