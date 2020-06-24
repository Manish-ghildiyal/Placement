import java.util.Arrays;

public class Circular_queue {
    private int rear, front;
    private int size;
    int arr[];
    Circular_queue(int s){
        front = rear = -1;
        arr = new int[s];
        size=s;
    }
    public void enqueue(int value) throws Exception{
        if ((front == 0 && rear == size-1) ||
                (rear == (front-1)%(size-1)))
            throw new Exception("bhari hai be");
        else if (front == -1) /* Insert First Element */
        {
            front = rear = 0;
            arr[rear] = value;
        }
        else if (rear == size-1 && front != 0)
        {
            rear = 0;
            arr[rear] = value;
        }
        else
        {
            rear++;
            arr[rear] = value;
        }
    }
    public void dequeue() throws Exception{
        if (front == -1)
        {
            throw new Exception("khali hai be");
        }

        int data = arr[front];
        arr[front] = -1;
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (front == size-1)
            front = 0;
        else
            front++;

    }
    public void display(){
        if (front == -1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Elements in Circular Queue are: ");
        if (rear >= front)
        {
            for (int i = front; i <= rear; i++)
                System.out.println(arr[i]);
        }
        else
        {
            for (int i = front; i < size; i++)
                System.out.println(arr[i]);

            for (int i = 0; i <= rear; i++)
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        Circular_queue c=new Circular_queue(5);
        c.enqueue(1);
        c.enqueue(2);
        c.display();

    }
}
