package Producer_Consumer2;

import java.util.Random;

public class ProducerConsumer {
    public static void main(String[] args) {
        Box x=new Box();
        Producer p=new Producer(x);
        Consumer c=new Consumer(x);
        Thread thread1=new Thread(p);
        Thread thread2=new Thread(c);
        thread1.start();
        thread2.start();


    }
}
class Box{
    int value;
    boolean v=false;
    public synchronized void put(int b){
        if(v){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }else {
            value = b;
        }
            v=true;
            notifyAll();

    }
    public synchronized void get(){
        if(!v){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        v=false;
        notifyAll();
    }
}

class Producer implements Runnable{
    private Box x;
    Random r=new Random();


    public Producer(Box x) {
        this.x = x;
    }

    @Override
    public void run() {
        int b=r.nextInt(20)+1;
        x.put(b);
    }
}

class Consumer implements Runnable{
private Box x;

    public Consumer(Box x) {
        this.x = x;
    }

    @Override
    public void run() {
        while (true){
            x.get();
        }
    }
}