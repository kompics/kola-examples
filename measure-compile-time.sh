#!/bin/bash

for run in {1..25}
do
  echo "Starting Run#$run";
  echo "Cleaning...";
  mvn clean &> /dev/null;
  echo "Building";
  time mvn compile &> /dev/null;
  echo "Done"
done
