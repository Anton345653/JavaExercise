package Vnytrennye_class;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.createQuery();
        User.Query query=user.new Query();
        query.printToLog();
        User.Query query1=new User().new Query();
        query1.printToLog();
    }
}
