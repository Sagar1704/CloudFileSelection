#!/bin/bash

# SSH to the host machine of HDFS Master without password(Added the key)
# SSH into hdfsMaster VM and stop hdfs. Then shutdown the VM.
echo "Stopping hdfsMaster and, hdfsSlaves 8 and 9"
sleep 2s
ssh groupb@groupb13 "ssh hduser@hdfsMaster \"/usr/local/hadoop/sbin/stop-yarn.sh; /usr/local/hadoop/sbin/stop-dfs.sh; jps; sleep 5s\"; ssh hduser@hdfsSlave8 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave9 \"sudo shutdown -P now\"; exit"

echo "Stopping hdfsSlaves 1, 2, 3, 10 and 11"
sleep 2s
ssh groupbslave1@groupb12 "ssh hduser@hdfsSlave1 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave2 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave3 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave10 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave11 \"sudo shutdown -P now\"; exit"

echo "Stopping hdfsSlaves 4, 5, 12, 13 and 14"
sleep 2s
ssh groupb@groupb22 "ssh hduser@hdfsSlave4 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave5 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave12 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave13 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave14 \"sudo shutdown -P now\"; exit"

echo "Stopping hdfsSlaves 6, 7, 15, 16 and 17"
sleep 2s
ssh groupb@groupb23 "ssh hduser@hdfsSlave6 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave7 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave15 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave16 \"sudo shutdown -P now\"; ssh hduser@hdfsSlave17 \"sudo shutdown -P now\"; exit"

#Shutdown hdfsMaster
ssh groupb@groupb13 "ssh hduser@hdfsMaster \"sudo shutdown -P now\"; exit"
