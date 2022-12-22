public class Lesson1 {
    private final Object obj=new Object();
    private volatile char bykva='A';

    public static void main(String[] args) {
        Lesson1 lesson1=new Lesson1();

        Thread thread1=new Thread(()->{
            lesson1.printA();
        });
        Thread thread2=new Thread(()->{
           lesson1.printB();
        });
        Thread thread3=new Thread(()->{
            lesson1.printC();
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void printA(){
        synchronized (obj){
            try {
                for (int i = 0; i < 5; i++) {
                    while (bykva != 'A') {
                        obj.wait();
                    }
                    System.out.print("A");
                    bykva = 'B';
                    obj.notifyAll();
                }
            }   catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            public void printB(){
                synchronized (obj){
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (bykva != 'B') {
                                obj.wait();
                            }
                            System.out.print("B");
                            bykva = 'C';
                            obj.notifyAll();
                        }
                    }   catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            public void printC(){
                synchronized (obj){
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (bykva != 'C') {
                                obj.wait();
                            }
                            System.out.print("C");
                            bykva = 'A';
                            obj.notifyAll();
                        }
                    }   catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            }






