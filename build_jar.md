
performance

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

