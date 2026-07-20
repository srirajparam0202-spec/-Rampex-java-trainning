package Day_25;
class Queue{

    int arr[];
    int size;
    int front;
    int rear;
    Queue(){
        arr=new int[5];
        size=0;
        front=-1;
        rear=-1;
    }

    public void enqueue(int val){
        rear++;
        arr[rear]=val;

        size++;
        front=0;


    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+"  ");
        }
    }


}

public class QueueDemo {
    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.display();


    }

}
