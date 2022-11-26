package Collection.Zadanie5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Ivan","123");
        phoneBook.add("Vova","345");
        phoneBook.add("Ivan","123");
        phoneBook.get("Ivan");

    }
}
