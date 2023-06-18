package com.example.scheduler;

import java.util.*;
class circularLinkedListNode {
    int id;
    int arrivalTimeOfProcess;
    int burstTimeOfProcess;
    boolean isArrived;
    circularLinkedListNode next;
    circularLinkedListNode(int id, int arrivalTimeOfProcess, int burstTimeOfProcess) {
        this.id = id;
        this.arrivalTimeOfProcess = arrivalTimeOfProcess;
        this.burstTimeOfProcess = burstTimeOfProcess;
        this.isArrived = false;
    }
}