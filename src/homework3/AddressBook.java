import java.util.Scanner;

public class AddressBook {
    private String name;
    private String phone;

    public AddressBook(String name, String phone){
        this.name=name;
        this.phone=phone;
        int count=0;
    }
    public boolean isSame(String name) {

        if (this.name==name){
            return false;
    }
    else {
            return true;
        }
    public String toString() {
        return Boolean.parseBoolean(String.format("%/s(%s)",name,phone));
    }
    public static void printAll(int count, AddressBook [] books){
            count=0;
            AddressBook [count] = new(name,phone);
            System.out.println(new AddressBook);
            count++;
        }

    }
    public static AddressBook findByName(String name, int count, AddressBook [] books){
        AddressBook book= null;

        return book;
    }
    public static void showMenu(){
        System.out.println("===== Menu =====");
        System.out.println("1. Add Address");
        System.out.println("2. PrintAll");
        System.out.println("3. Find By Name");
        System.out.println("4. Quit");
    }
    public static int getMenu(Scanner sc){
        return Integer.parseInt(sc.nextLine().trim());
    }
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        AddressBook books []= new AddressBook[10];
        int count=0;
        while(true) {
            showMenu();
            int menu = getMenu(sc);
            if (menu == 1) {
                String name = sc.nextLine();
                String phone = sc.nextLine();
                books[count] = new AddressBook(name, phone);
                count++;
            } else if (menu == 2) {
                printAll(count, books);
            } else if (menu == 3) {
                String name = sc.nextLine();
                AddressBook book = findByName(name, count, books);
                if (book != null) {
                    System.out.println("Find: " + book.toString());
                } else {
                    System.out.println("There is no address : " + name);
                }
            } else if (menu == 4) {
                break;
            }
        }
    }
}

