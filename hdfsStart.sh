#!/bin/bash
# SSH to the host machine of HDFS Slaves without password(Added the key)
#Start the HDFS Slaves
echo "Starting hdfsSlaves 1, 2, 3, 10 and 11"
sleep 2s
ssh groupbslave1@groupb12 "virsh start hdfsSlave1; virsh start hdfsSlave2; virsh start hdfsSlave3; virsh start hdfsSlave10; virsh start hdfsSlave11; sleep 10s; exit"

echo "Starting hdfsSlaves 4, 5, 12, 13 and 14"
sleep 2s
ssh groupb@groupb22 "virsh start hdfsSlave4; virsh start hdfsSlave5; virsh start hdfsSlave12; virsh start hdfsSlave13; virsh start hdfsSlave14; sleep 10s; exit"

echo "Starting hdfsSlaves 6, 7, 15, 16 and 17"
sleep 2s
ssh groupb@groupb23 "virsh start hdfsSlave6; virsh start hdfsSlave7; virsh start hdfsSlave15; virsh start hdfsSlave16; virsh start hdfsSlave17; sleep 10s; exit"

#Start the Virtual machine
# SSH to the host machine of HDFS Master without password(Added the key)
#Start the HDFS Master VM
echo "Starting hdfsSlaves 8 and 9, and hdfsMaster"
sleep 2s
ssh groupb@groupb13 "virsh start hdfsSlave8; virsh start hdfsSlave9; sleep 10s; virsh start hdfsMaster; sleep 30s; ssh hduser@hdfsMaster \"/usr/local/hadoop/sbin/start-dfs.sh; /usr/local/hadoop/sbin/start-yarn.sh; sleep 10s; /usr/local/hadoop/bin/hdfs dfsadmin -report; exit;\"; exit"
