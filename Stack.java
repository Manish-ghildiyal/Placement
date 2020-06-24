import java.util.Arrays;

public class Stack {
    private int top;
    private int default_size=6;
    public int ar[];
    Stack(){
        top=-1;
        this.ar=new int[default_size];
    }
    public boolean isFull(){
        return top==ar.length-1;
    }
    public boolean push(int element) throws  Exception
    {
        if(isFull())
            throw new Exception("bhar gayi hai be");
        ar[++top]=element;
        return true;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int  pop() throws Exception
    {
        if(isEmpty())
            throw new Exception("khali hai be");
     return ar[top--];
    }
//    public int[] show(){
//        return ar;
//    }
    public void reverse_stack(int i) throws Exception{
        if (top==-1)
            return;
        int a= ar[i++];
        pop();
        reverse_stack(i);
        push(a);
    }

    public static void main(String[] args) throws Exception {
        Stack s=new Stack();
        for (int i = 0; i <s.ar.length ; i++) {
            s.push(i+1);
        }
        System.out.println("stack before reversing-"+Arrays.toString(s.ar));
        s.reverse_stack(0);
        System.out.println("stack after  reversing-"+Arrays.toString(s.ar));
    }
}
