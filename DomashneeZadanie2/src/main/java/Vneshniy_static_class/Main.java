package Vneshniy_static_class;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.createQuery();
        User.Query query=new User.Query();
        query.printToLog();

    }
}
