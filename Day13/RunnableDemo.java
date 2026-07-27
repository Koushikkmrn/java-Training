package Day13;

class Demo implements Runnable{

    public void run(){

        for(int i=1;i<=5;i++){

            System.out.println(i);
        }
    }
}

public class RunnableDemo{

    public static void main(String[] args){

        Thread t=new Thread(new Demo());

        t.start();
    }
}