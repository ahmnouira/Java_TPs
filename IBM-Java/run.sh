#! /bin/sh

if test $1=="clear"; then
    echo $1
    echo $#
	rm -f *.class
    echo "All .class files has been cleared"

fi


    javac *.java

    echo "----- Circle -----\n"
    java Circle
    echo "\n----- Collections -----\n"
    java Collections
    echo "\n----- Customer -----\n"

