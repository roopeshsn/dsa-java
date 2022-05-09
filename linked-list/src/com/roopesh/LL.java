package com.roopesh;

public class LL {

    public Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; // List will already have a head. So, we need to tranfer the head to the new node
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node; // List will already have a tail. So, we need to tranfer the tail to the new node
            tail = node;
            size++;
        }
    }

    public void insert(int idx, int val) {
        if(idx == 0) {
            insertFirst(val);
            return;
        }

        if(idx == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        // Node node = new Node(val);
        // node.next = temp.next;
        if(temp == null) {
            System.out.println("Insertion failed");
            return;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void print(Node node) {
        Node temp = node;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int deleteLast() {
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size -= 1;
        return val;
    }

    public int delete(int idx) {
        if(idx == 0) {
            return deleteFirst();
        }

        if(idx == size - 1) {
            return deleteLast();
        }

        Node prev = get(idx-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size -= 1;
        return val;
    }

    public Node get(int idx) {
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Recursion version
    public int getUsingRecursion(int idx) {
        Node temp = head;
        Node node = getUsingRecursion(idx, temp);
        return node.value;
    }

    private Node getUsingRecursion(int idx, Node node) {
        if(idx == 0) {
            return node;
        }
        return getUsingRecursion(idx-1, node.next);
    }

    public void insertUsingRecursion(int val, int idx) {
        if(idx >= size) {
            return;
        }
        head = insertUsingRecursion(val, idx, head, head.value);
    }

    private Node insertUsingRecursion(int val, int idx, Node node, int currentNodeValue) {
        if(idx == 0) {
            Node temp = new Node(val, node);
            size += 1;
            return temp;
        }
        node.next = insertUsingRecursion(val, idx-1, node.next, node.next.value);
        return node;
    }

    // Remove duplicates from sorted LL
    public void removeDuplicates() {
        Node temp = head;
        while(temp.next != null) {
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // Merge Linked Lists
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // find middle using fast and slow pointer method
    public Node findMiddle() {
        Node fast = head;
        Node slow = fast;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public int getMidIdx() {
        Node fast = this.head;
        Node slow = this.head;
        int midIdx = 1;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            midIdx++;
        }

        return midIdx;
    }

    // bubble sort
    private void bubbleSort() {
        bubbleSort(this.size - 1, 0);
    }

    private void bubbleSort(int end, int start) {
        if(end == 0) {
            return;
        }

        if(start < end) {
            Node first = get(start);
            Node second = get(start+1);

            if(first.value > second.value) {
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail) {
                    Node prev = get(start-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(start-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(end, start+1);
        } else {
            bubbleSort(end-1, 0);
        }
    }

    // reversal of linked list through recursion
    private void reverseUsingRec(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverseUsingRec(node.next);
        // System.out.println(tail.value);
        // System.out.println(node.value);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in-place reversal of linked list
    private void reverse() {
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    private Node reverseList(Node head) {
        if(head == null) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }

        return prev;
    }

    private void reverseRange(Node head, int left, int right) {
        Node prev = null;
        Node current = head;

        // skip the first n-1 nodes
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
        Node next = current.next;

        // reverse between range
        for (int i = 0; current != null && i < right-left+1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }

        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
    }

    private boolean isPalindrome(Node head) {
        Node mid = findMiddle();
        Node secondHead = reverseList(mid);
        Node rereverseHead = secondHead;

        print(head);
        print(secondHead);

        // compare both the values
        while(head != null && secondHead != null) {
            if(head.value != secondHead.value) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        reverseList(rereverseHead);

        if(head == null || secondHead == null) {
            return true;
        }

        return false;
    }

    //reorder list
    private void reorderList(Node head) {
        Node mid = findMiddle();
        Node secondHead = reverseList(mid);

        while(head != null) {

        }
    }

    // node
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

//        for(int i = 5; i > 0; i--) {
//            first.insertLast(i);
//        }
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);

        Node head = first.head;
        first.print(head);

        Node mid = first.findMiddle();
        Node node = first.reverseList(mid);
        first.print(node);
        first.print(head);
    }
}
