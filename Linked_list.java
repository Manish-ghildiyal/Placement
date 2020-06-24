import java.util.Stack;

public class Linked_list {
    public static class  Node{
        private int value;
        private  Node next;

        public  Node(int value) {
            this.value =value;
        }
    }
    private Node head;
    private int size;
    private Node tail;
    public Linked_list() {
        this.size = 0;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
        System.out.println("element inserted "+head.value);
        if(tail==null)
            tail=head;
    }
    public void insertlast(int value){
        Node node=new Node(value);
        if(size==0)
        {
            insertfirst(value);
            return;
        }
        Node temp;
        temp=head;
        while (temp.next!=null)
            temp=temp.next;
        temp.next=node;
        node.next=null;
        tail=node;
        size++;
        System.out.println("element inserted "+tail.value);
    }
    public void insertmid(int value,int index){
        if (head==null || index==0)
            insertfirst(value);
//        else if (index==size-1)
//            insertlast(value);
        else {
            Node node=new Node(value);
            Node node1=head;
            Node node2=head;
            node2=node2.next;
            while (index-1>0){
                node1=node1.next;
                node2=node2.next;
                index--;
            }
            node1.next=node;
            node.next=node2;
            System.out.println("element inserted "+node.value);
            size++;
        }
    }
    public void deletefirst(){
        if (head==null)
            return;
        Node temp=head;
        head=head.next;
        size--;
        System.out.println("element deleted "+temp.value);
    }
    public void deletelast(){
        if (head==null)
            return;
        else if (size==1) {
            head = null;
            size--;
        }
        Node temp=head;
        while (temp.next.next!=null)
            temp=temp.next;
        temp.next=null;
        tail=temp;
        size--;
        System.out.println("element deleted "+tail.value);
    }
    public void deletemid(int index){
        if (head==null)
            return;
        else if (size-1==index)
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
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public void reverse2(){ //using stack
        Node temp=head;
        Stack<Integer> s=new Stack<>();
        while (temp!=null){
            s.push(temp.value);
            temp=temp.next;
            size--;
        }
        System.out.println(s);
        head=null;
        while (!s.empty()){
            int a=s.pop();
            insertlast(a);
        }
    }
    public void swap(int a ,int b) //by value
    {
        Node temp1=head,temp2=head,temp=head;
        while (temp!=null)
        {
            if(temp1.value==a)
                break;
            temp=temp.next;
            temp1=temp1.next;
        }
        temp=head;
        while(temp!=null)
        {
            if (temp2.value==b)
                break;
            temp=temp.next;
            temp2=temp2.next;
        }
        temp1.value=b;
        temp2.value=a;
    }
    public   boolean pallindrome(Linked_list l)
    {
        Linked_list l1=new Linked_list();
        Node temp=l.head;
        while(temp!=null)
        {
            l1.insertlast(temp.value);
            temp=temp.next;
        }
        l1.reverse();

        temp=l.head;
        Node temp2=l1.head;

        while (temp!=null )
        {
            if(temp.value!=temp2.value)
                return false;
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;
    }
    public void ithFromLast(int k)
    {
        Node temp1=head,temp2=head;
        for (int i = 0; i <k ; i++) {
            temp1= temp1.next;
        }
        while(temp1!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println("ith element is "+temp2.value);

    }
    public void kthreverse(int i,Linked_list l) {
        Stack<Integer> s1 = new Stack<>();
        Linked_list l1 = new Linked_list();
        int j = i;
        Node temp = l.head;
        while (temp != null) {
            while (temp != null && j > 0) {
                s1.push(temp.value);
                temp = temp.next;
                j--;
            }
            while (!s1.isEmpty()) {
                int a = s1.pop();
                l1.insertlast(a);
            }
            j = i;
        }
        l1.display();
    }
    public void display()
    {
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
        Linked_list l=new Linked_list();
        Linked_list l1=new Linked_list();
        l.insertfirst(2);
        l.insertlast(3);
        l.insertlast(5);
        l.insertlast(6);
        l.insertlast(7);
        l.display();
        l.kthreverse(2,l);

    }
}
