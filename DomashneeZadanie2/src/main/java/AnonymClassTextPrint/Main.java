package AnonymClassTextPrint;

public class Main {
    public static void main(String[] args) {
       TextPrint textPrint=new TextPrint() {
           public void print(String str) {

           }
       };
       textPrint.print("Вызов");
    }

}
