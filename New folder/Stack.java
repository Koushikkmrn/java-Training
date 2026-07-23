public class Stack{
      class Node{
       int data;
        Node next;
        public Node (int data){
             this.data =data;
             this.next=null;
        }
     Node top = null;
     int size =0;

      } 
      public int top(){}
      public int push(){
        Node temp;
        temp.next= top;
        top = temp;
        size++;
      }
      public int pop(){}
      public boolean isEmpty(){ 
        return top==null;}
      public int size(){}
}
public class Main{
    public static void main(String[] args) {
        
    }
}