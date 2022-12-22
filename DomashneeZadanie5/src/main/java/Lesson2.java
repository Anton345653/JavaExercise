import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Lesson2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int size = 1000000;
        int[] arr = new int[size];
        Arrays.fill(arr, 1);

        Sum result=new Sum();
        result.sumElements(arr);
        System.out.println(result.getValue());
    }
}

class Sum {
    private int b = 0;
    ExecutorService service = Executors.newFixedThreadPool(5);

    private int foo(int[] arr, int first, int last) {
        int b=0;
        for (int i = first; i < last; i++) {
            b += arr[i];
        }
        return b;
    }
    public void sumElements(int[] arr) throws ExecutionException, InterruptedException {
        int first = 0;
        int last = 200000;
        List<Future<Integer>> future = new ArrayList<>();
        for(int i=0;i<5;i++){
            int first1 = first;
            int last1 = last;
            future.add(service.submit(() -> foo(arr, first1, last1)));
            first = last;
            last = last + 200000;
        }
        service.shutdown();
        for (Future<Integer> f : future) {
            b += f.get();
        }
    }
    public int getValue() {
        return this.b;
    }

}












