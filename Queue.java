import java.util.Arrays;

public class Queue {
    public int ar[];
    private int DEFAULT_SIZE=5;
    int front=0,end=0;
    public Queue()
    {
        this.ar=new int[DEFAULT_SIZE];
    }
    public boolean isFull ()
    {
        return end==ar.length;}
    public boolean enqueue(int element) throws Exception
    {
        if(isFull())
            throw new Exception("bhar gayi hai be");
        ar[end++]=element;
        return true;
    }
    public boolean isEmpty()
    {
        return end==0;
    }
    public int  dequeue() throws Exception
    {
        if(isEmpty()) {
            throw new Exception("khali hai be");

        }        int temp=ar[0];

        for (int i = 1; i <end ; i++) {
            ar[i-1]=ar[i];
        }
        end--;
        return temp;
    }
    public void reverse_queue() throws Exception{
        if (end==0)
            return;
        int temp=dequeue();
        reverse_queue();
        enqueue(temp);

    }
    public void display(){
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        for (int i = 0; i <q.ar.length ; i++) {
            q.enqueue(i+1);
        }
        q.display();
        q.reverse_queue();
        q.display();

    }
}
