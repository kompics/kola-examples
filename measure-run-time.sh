#!/bin/bash

MAIN=$1
# se.sics.kola.examples.pingpong.java.Main
# or
# se.sics.kola.examples.pingpong.Main
COMMAND="java -cp target/kola-examples-1.9.3-SNAPSHOT.jar $MAIN";
echo "Cleaning...";
rm measurements.txt;
for run in {1..25}
do
  echo "Starting Run#$run";
  $COMMAND >> measurements.txt;
  echo "Done"
done
