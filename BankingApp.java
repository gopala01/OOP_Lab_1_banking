/**
* ECS414U - Object Oriented Programming
* Queen Mary University of London, 2021/22.
* <p>
* Week 1 lab session.
*/

public class BankingApp{
    public static void main(String[] args){

        Account acc1 = new Account();
        acc1.deposit(10);
        System.out.print("01: ");
        System.out.println(acc1.getBalance());

        acc1 = new Account();
        System.out.print("02: ");
        System.out.println(acc1.getBalance());

        Account acc2 = new Account(10);
        acc2.deposit(10);
        System.out.print("03: ");
        System.out.println(acc2.getBalance());

        Account acc3 = acc1;
        acc3.deposit(10);
        System.out.print("04: ");
        System.out.println(acc1.getBalance());
        System.out.print("05: ");
        System.out.println(acc3.getBalance());

        acc1.deposit(10);
        System.out.print("06: ");
        System.out.println(acc1.getBalance());

        acc2 = new Account();
        System.out.print("07: ");
        System.out.println(acc1.getBalance() + acc2.getBalance() + " is the result.");
        System.out.print("08: ");
        System.out.println("The result is " + acc1.getBalance() + acc2.getBalance());

        Account acc = new Account(10);

        User u1 = new User("John Doe", 1, acc);
        u1.deposit(10);
        System.out.print("09: ");
        System.out.println(u1.getBalance());

    }
}

