public class program {
    public static void main(String[] args) {
        LinkList linkedList = new LinkList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(8);
        linkedList.insertFirst(5);
        linkedList.insertFirst(3);
        linkedList.printList();
        System.out.println("");
        System.out.println("Разворот");
        linkedList.revert();
        linkedList.printList();
    }

    public static class LinkList {
        Node head;
        public class Node {
            int value;
            Node next;

        public void displayNodeData() {
            System.out.print(value + "->");
        }
        }
        
    public void insertFirst (int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        }

        public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
        }
        private void revert(Node currentNode, Node previousNode) {
            if (currentNode.next == null) {
                head = currentNode;
            } else {
                revert(currentNode.next, currentNode);
            }
            currentNode.next = previousNode;
            previousNode.next = null;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                current.displayNodeData();
                current = current.next;
    
            }
            System.out.print("NULL");
    
        }
    } 
}