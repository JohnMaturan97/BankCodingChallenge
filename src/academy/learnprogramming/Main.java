package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Account info with constructor implemmented
        Account johnsAccount = new Account(1234, 0.00, "John", "Sassy99@gmail.com", 911);

        //Printing the main method with implemented constructor by using ".get"
        System.out.println(johnsAccount.getBalance());
        System.out.println(johnsAccount.getCustomerName());
        System.out.println(johnsAccount.getEmail());
        System.out.println("*********************************************"); //splitter

        //Calling the sets and Gets
        johnsAccount.deposit(50.00);
        johnsAccount.withdrawal(100.00);
        johnsAccount.deposit(51.00);
        johnsAccount.withdrawal(100.00);

        Account sassyAccount = new Account("Sassy", "Sassy0@gmail.com", 911);
        System.out.println("*********************************************"); //splitter
        System.out.println(sassyAccount.getNumber() + " name " + sassyAccount.getCustomerName());
    }
}
