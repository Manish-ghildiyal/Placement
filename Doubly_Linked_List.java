public class Doubly_Linked_List {
    public static class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    private Node head;
    private int size;
    private Node tail;
    public Doubly_Linked_List() {
        this.size = 0;
    }
    public void insertfirst(int value){
        Node node= new Node(value);
        node.next=head;
        node.prev=null;
        head=node;
        size++;
        System.out.println("element inserted "+head.value);
    }
    public void insertlast(int value){
        Node node=new Node(value);
        Node temp=head;
        if (size==0)
            insertfirst(value);
        else {
            while (temp.next!=null)
                temp=temp.next;
            temp.next=node;
            node.next=null;
            node.prev=temp;
            tail=node;
            size++;
            System.out.println("element inserted "+tail.value);
        }
    }
    public void insertmid(int value,int index){
        if (index==0)
            insertfirst(value);
        else if (index==size-1)
            insertlast(value);
        else {
            Node node=new Node(value);
            Node temp=head;
            Node temp2=temp.next;
            while (index-1>0){
                temp=temp.next;
                temp2=temp2.next;
                index--;
            }
            temp.next=node;
            node.prev=temp;
            node.next=temp2;
            temp2.prev=node;
            size++;
            System.out.println("element inserted "+node.value);
        }
    }
    public void deletefirst(){
        if (head==null)
            return;
        Node temp=head;
        head=head.next;
        System.out.println("element deleted "+temp.value);
        size--;
    }
    public void deletelast(){
        if (head==null)
            return;
        if (size==1)
        {
            head=null;
            return;
        }
        Node temp=head;
        Node temp1=head.next;
        while (temp1.next!=null){
            temp=temp.next;
            temp1=temp1.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        System.out.println("element deleted "+temp1.value);
    }
    public void deletemid(int index){
        if (index==0)
            deletefirst();
        else if (index==size-1)
            deletelast();
        else {
            Node node1=head;
            Node node=node1.next;
            Node node2=node.next;
            while (index-1>0){
                node1=node1.next;
                node=node.next;
                node2=node2.next;
                index--;
            }
            node1.next=node2;
            node2.prev=node1;
            size--;
            System.out.println("element deleted "+node.value);
        }
    }
    public void reverse()
    {
        reverse(head);
    } //using Recursion
    public void reverse(Node node)
    {
        if(node==tail)
        {
            head=tail;
            head.prev=null;
            return;
        }
        reverse(node.next);
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=null;
    }
    public void display(){
        Node node=head;
        System.out.println("the list is");
        while(node!=null)
        {
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Doubly_Linked_List l=new Doubly_Linked_List();
        l.insertlast(1);
        l.insertlast(2);
        l.insertlast(3);
        l.insertlast(4);
        l.insertlast(5);
        l.display();
        l.reverse();
        l.display();
    }
}
