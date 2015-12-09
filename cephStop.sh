#!/bin/bash
#SSH to the host machine of ceph-mon nodes,ceph-osd nodes and ceph-mds nodes  without password(Added the key)
#Stop all the ceph nodes

echo -e "\n\nStopping ceph-mon  and ceph-osd 0"
sleep 2s
ssh groupb@groupb21 "sleep 10s; ssh root@ceph-node1 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node4 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node5 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node6 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node7 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node8 \"service ceph stop; sudo shutdown -P now;\"; exit"

echo -e "\n\nStopping ceph-mon ,ceph-osd 1"
sleep 2s
ssh groupb@groupb11 "sleep 10s; ssh root@ceph-node2 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node3 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node9 \"service ceph stop; sudo shutdown -P now;\"; exit; sleep 10s; ssh root@ceph-node10 \"service ceph stop; sudo shutdown -P now;\"; exit"

echo -e "\n\nStopping ceph-mon, ceph-osd 3, ceph-mds "
sleep 2s
ssh groupb@groupb21 "sleep 10s; ssh root@ceph-admin \"service ceph stop; sudo shutdown -P now;\"; exit"

echo -e "\n\n *** Stopped all Ceph nodes and services ***"


