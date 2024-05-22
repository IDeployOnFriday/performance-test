This repo contains a built jar to be used for db testing 

# Run On DB
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
