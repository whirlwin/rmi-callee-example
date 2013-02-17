#!/usr/bin/sh
java -cp bin/\
     -Djava.rmi.server.codebase=file:$PWD/g.jar\
     Greeter
