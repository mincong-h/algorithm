#!/bin/bash
counter=0
while read line && [ $counter -le 10 ]; do
  let 'counter += 1'
  if [ $counter -eq 10 ]; then
    echo $line
    exit 0
  fi
done < file.txt
