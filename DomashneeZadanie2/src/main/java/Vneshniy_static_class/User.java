package Vneshniy_static_class;

public class User {
    private static String login;
    private static String password;

    public void createQuery(){
        Query query=new Query();
        query.printToLog();
    }

    public static class Query{

        public void printToLog(){
            System.out.println("Пользователь с логином "+login+" и паролем "+password+" отправил запрос");
        }
    }
}
