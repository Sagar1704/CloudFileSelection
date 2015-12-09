#!/bin/bash
# SSH to the host machine of ceph monitor nodes, osd node and mds nodes without password(Added the key)
#Start the nodes

echo -e "\n\n ******** Starting Ceph *********"

echo -e "\n Starting ceph-mon  and ceph-osd "
sleep 2s
ssh groupb@groupb21 "virsh start ceph-node1; sleep 10s; ssh root@ceph-node2 \"service ceph start; exit;\" exit; virsh start ceph-node4; sleep 10s; ssh root@ceph-node4 \"service ceph start; exit;\" exit;virsh start ceph-node5; sleep 10s; ssh root@ceph-node5 \"service ceph start; exit;\" exit; virsh start ceph-node6; sleep 10s; ssh root@ceph-node6 \"service ceph start; exit;\" exit; virsh start ceph-node7; sleep 10s; ssh root@ceph-node7 \"service ceph start; exit;\" exit; virsh start ceph-node8; sleep 10s; ssh root@ceph-node8 \"service ceph start; exit;\" exit"


echo -e "\n ceph-mon ,ceph-osd 1"
sleep 2s
ssh groupb@groupb11 "virsh start ceph-node2; sleep 10s; ssh root@ceph-node2 \"service ceph start; exit;\" exit; virsh start ceph-node3; sleep 10s; ssh root@ceph-node3 \"service ceph start; exit;\" exit; virsh start ceph-node9; sleep 10s; ssh root@ceph-node9 \"service ceph start; exit;\" exit; virsh start ceph-node10; sleep 10s; ssh root@ceph-node10 \"service ceph start; exit;\" exit"


echo -e "\n Starting ceph-mon,ceph-osd 3, ceph-mds and checking the staus"
sleep 2s
ssh groupb@groupb11 "virsh start ceph-admin; sleep 10s; ssh root@ceph-admin \"service ceph start; sleep 10s; ceph status; exit;\"; exit"
