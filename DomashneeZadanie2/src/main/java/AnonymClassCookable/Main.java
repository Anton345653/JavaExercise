package AnonymClassCookable;

public class Main {
    public static void main(String[] args) {
        Food food=new Food();
        Cookable cookable=new Cookable() {
            public void cook(String str) {
                System.out.println("анонимный");
            }
        };

        food.prepare(cookable,"готово");
    }
}
