package Vnytrennye_class;
public class User {
    private String login;
    private String password;

    public void createQuery(){
        Query query=new Query();
        query.printToLog();
    }

    public class Query{

        public void printToLog(){
            System.out.println("Пользователь с логином "+login+" и паролем "+password+" отправил запрос");
        }
    }
}
