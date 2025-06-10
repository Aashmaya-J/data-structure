package day4;
class Node {
int data;
Node prev, next;
Node(int data) {
this.data = data;
}
}
class DoublyLinkedList {
Node head, tail;
void insert(int data) {
Node newNode = new Node(data);
if (head == null) {
head = tail = newNode;
return;
}
tail.next = newNode;
newNode.prev = tail;
tail = newNode;
}
void displayForward() {
if (head == null) {
System.out.println("List is empty");
return;
}
System.out.print("Forward: ");
Node temp = head;
while (temp != null) {
System.out.print(temp.data + " <-> ");
temp = temp.next;
}
System.out.println("null");
}
void displayBackward() {
if (tail == null) {
System.out.println("List is empty");
return;
}
System.out.print("Backward: ");
Node temp = tail;
while (temp != null) {
System.out.print(temp.data + " <-> ");
temp = temp.prev;
}
System.out.println("null");
}
}
public class task1 {
public static void main(String[] args) {
DoublyLinkedList dll = new DoublyLinkedList();
dll.insert(10);
dll.insert(20);
dll.insert(30);
dll.insert(40);
dll.displayForward();
dll.displayBackward();
}
}

