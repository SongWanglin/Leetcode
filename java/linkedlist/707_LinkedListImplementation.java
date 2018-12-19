{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class Node\{\
    int val;\
    Node next = null;\
    public Node()\{\}\
    public Node(int v)\{\
        this.val = v;\
    \}\
    public boolean isNull()\{\
        return false;\
    \}\
\}\
\
class MyLinkedList \{\
    private Node head ;\
    int length;\
    /** Initialize your data structure here. */\
    public MyLinkedList() \{\
        head = null;\
        length = 0;\
    \}\
    \
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */\
    public int get(int index) \{\
        if ( index<0 || index>length-1) \
            return -1;\
        Node temp = head;\
        if (index==0 )\{\
            return head.val;\
        \}\
        for(int i=0; i<index; i++)\{\
            if(temp.next==null)\
                break;\
            temp = temp.next;  \
        \}\
        return temp.val;\
    \}\
    \
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */\
    public void addAtHead(int val) \{\
        Node temp = new Node(val);\
        temp.next = head;\
        head = temp;\
        ++length;\
    \}\
    \
    /** Append a node of value val to the last element of the linked list. */\
    public void addAtTail(int val) \{\
        Node temp = new Node(val);\
        Node temp2 = head;\
        while (temp2.next!=null)\{\
            temp2 = temp2.next;\
        \}\
        temp2.next = temp;\
        length++;\
    \}\
    \
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */\
    public void addAtIndex(int index, int val) \{\
        if(index<0||index>length)\
            return;\
        Node newNode = new Node(val);\
        Node temp = head;\
        if(index==0)\{\
            this.addAtHead(val);\
        \} \
        else if (index == length)\{\
            this.addAtTail(val);\
        \}\
        else\{\
            for(int i=0; i<index-1; i++)\{\
                temp = temp.next;  \
            \}\
            newNode.next = temp.next;\
            temp.next = newNode;\
            length++;\
        \}\
    \}\
    \
    /** Delete the index-th node in the linked list, if the index is valid. */\
    public void deleteAtIndex(int index) \{\
        if(index<0||index>length-1)\
            return;\
        Node temp = head;\
        if(index==0)\{\
            head = head.next; --length;\
        \} else\{\
            for(int i=0; i<index-1; i++)\{\
                temp = temp.next;  \
            \}\
            Node delete = temp.next;\
            temp.next = delete.next;\
            delete.next = null;\
            --length;\
        \}\
    \}\
\}\
\
/**\
 * Your MyLinkedList object will be instantiated and called as such:\
 * MyLinkedList obj = new MyLinkedList();\
 * int param_1 = obj.get(index);\
 * obj.addAtHead(val);\
 * obj.addAtTail(val);\
 * obj.addAtIndex(index,val);\
 * obj.deleteAtIndex(index);\
 */}