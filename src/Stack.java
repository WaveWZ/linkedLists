public class Stack {
    Node head;
    LinkedList list;
    public Stack(){
        this.list = new LinkedList();
    }
    public void push(int data){
        list.prepend(data);
        return;
    }
    public int pop(){
        int num = list.head.data;
        list.removeElementFromLast();
        return num;
    }
    public int peek(){
        return list.head.data;
    }
    public void size(){
        list.findSize();
    }
    public void isEmpty(){
        if(list.findSize()==0){
            System.out.println("Its empty!");
            return;
        }
        else{
            System.out.println("Its not empty!");
            return;
        }
    }
}
