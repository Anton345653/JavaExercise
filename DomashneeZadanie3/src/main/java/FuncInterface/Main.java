package FuncInterface;

public class Main {
    public static void main(String[] args) {

        FunctionalInterface f= i -> {
            if(i%13==0)return true;
            return false;
        };
        FunctionInterface2 f2= (str, str2) -> {
            if(str.length()<str2.length())
            return str2;
            else return str;
        };

    }
}
