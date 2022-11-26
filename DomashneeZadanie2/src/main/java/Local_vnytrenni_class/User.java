package Local_vnytrenni_class;

public class User {
    private String login;
    private String password;

    public void createQuery(){
         class Query{
            public void printToLog(){
                System.out.println("Пользователь с логином "+login+" и паролем "+password+" отправил запрос");
            }
        }
        Query query=new Query();
         query.printToLog();
    }



}
