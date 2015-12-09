#!/bin/bash
#SSH to the host machine of swift storage nodes and proxy node without password(Added the key)
#Stop the storage nodes
#ssh groupb@groupb23  "sleep 5s; ssh swift@proxyNode ;exit;"
echo -e "\n\nStopping proxynode and storageNode 16"
sleep 2s
ssh groupb@groupb23 "sleep 10s; ssh swift@proxyNode \"swift-init proxy stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode16 \"swift-init all stop; sudo shutdown -P now;\"; exit"

echo -e "\n\nStopping storageNode 1,2,3,4 and 5"
sleep 2s
ssh groupb@groupb13 "sleep 10s; ssh swift@storageNode1 \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode2 \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode3 \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode4 \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode5 \"swift-init all stop; sudo shutdown -P now;\"; exit"

echo -e "\n\nStopping storageNode 6,7,8,9 and 10"
sleep 2s
ssh groupb@groupb22 "sleep 10s; ssh swift@storageNode6 \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode7  \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode8  \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode9  \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode10  \"swift-init all stop; sudo shutdown -P now;\"; exit"

echo -e "\n\nStopping storageNode 11,12,13,14 and 15"
sleep 2s
ssh groupbslave1@groupb12 "sleep 10s; ssh swift@storageNode11 \"swift-init all stop; sudo shutdown -P now;\";  sleep 10s; ssh swift@storageNode12  \"swift-init all stop; sudo shutdown -P now;\";  sleep 10s; ssh swift@storageNode13  \"swift-init all stop; sudo shutdown -P now;\";  sleep 10s; ssh swift@storageNode14  \"swift-init all stop; sudo shutdown -P now;\"; sleep 10s; ssh swift@storageNode15  \"swift-init all stop; sudo shutdown -P now;\"; exit"

echo -e "\n\n *** Stopped all Swift nodes and services ***"



