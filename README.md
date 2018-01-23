# JavaTool

## Base64Encoder

A Base64 encoder. Give the plain text as input parameter, output the Base64 encoded string.

And also a example, form compile java to an executable Jar.

This example not set the ``PACKAGE`` in java file, if set will be ``PACKAGE_NAME.CLASS_NAME``, such as ``test.package.Base64Encode``.

## Compile java
Compile java command:

    javac src\Base64Encode\Base64Encode.java

The output is ``Base64Encode.class`` in ``src`` folder, same location with ``JAVA`` file.

## Run java
Run with class file.

    cd src\Base64Encode
    java Base64Encode

## Create JAR

Let ``class`` file at current folder.

Package the files into a ``JAR`` file.

    cp src\Base64Encode\Base64Encode.class .\
    jar cfme Base64Encoder.jar Manifest.txt Base64Encode Base64Encode.class

## Run JAR

    java -jar Base64Encoder.jar

# Reference

[Java HelloWorld](https://github.com/macagua/example.java.helloworld)
