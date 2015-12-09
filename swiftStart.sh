#!/bin/bash
# SSH to the host machine of swift storage nodes and proxy node without password(Added the key)
#Start the storage nodes
echo -e "\n\n ******** Starting Swift *********"
echo -e "\n Starting proxynode and storagenode 16"
sleep 10s
ssh groupb@groupb23 "virsh start proxyNode; sleep 5s; ssh swift@proxyNode \"swift-init proxy start; exit;\"; virsh start storageNode16; sleep 5s; ssh swift@storageNode16 \"swift-init all start; exit;\"; exit"

echo -e "\n Starting storagenode 1,2,3,4 and 5"
sleep 10s
ssh groupb@groupb13 "virsh start storageNode1; sleep 5s; ssh swift@storageNode1 \"swift-init all start; exit;\"; virsh start storageNode2; sleep 5s; ssh swift@storageNode2 \"swift-init all start; exit;\"; virsh start storageNode3; sleep 5s; ssh swift@storageNode3 \"swift-init all start; exit;\"; virsh start storageNode4; sleep 5s; ssh swift@storageNode4 \"swift-init all start; exit;\"; virsh start storageNode5; sleep 5s; ssh swift@storageNode5 \"swift-init all start; exit;\"; exit"

echo -e "\n Starting storagenode 6,7,8,9 and 10"
sleep 10s
ssh groupb@groupb22 "virsh start storageNode6; sleep 5s; ssh swift@storageNode6 \"swift-init all start; exit;\"; virsh start storageNode7; sleep 5s; ssh swift@storageNode7 \"swift-init all start; exit;\"; virsh start storageNode8; sleep 5s; ssh swift@storageNode8 \"swift-init all start; exit;\"; virsh start storageNode9; sleep 5s; ssh swift@storageNode9 \"swift-init all start; exit;\"; virsh start storageNode10; sleep 5s; ssh swift@storageNode10 \"swift-init all start; exit;\"; exit"

echo -e "\n Starting storagenode 11,12,13,14 and 15"
sleep 10s
ssh groupbslave1@groupb12 "virsh start storageNode11; sleep 5s; ssh swift@storageNode11 \"swift-init all start; exit;\"; virsh start storageNode12; sleep 5s; ssh swift@storageNode12 \"swift-init all start; exit;\"; virsh start storageNode13; sleep 5s; ssh swift@storageNode13 \"swift-init all start; exit;\"; virsh start storageNode14; sleep 5s; ssh swift@storageNode14 \"swift-init all start; exit;\"; virsh start storageNode15; sleep 5s; ssh swift@storageNode15 \"swift-init all start; exit;\"; exit"

echo -e "\n\n ******** All the swift nodes and services have started ********"
