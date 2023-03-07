package lab5stuff;
    import java.util.*;
class Database{

public static void bankAccount(){
    System.out.println("Welcome");
    String[] names = new String[100];
    double[] balances = new double[100];
    while (true){
    System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [q]uit:");
    Scanner input = new Scanner(System.in);
    String option = input.nextLine();
    
    //initialized outside of nested loops
    int i = 0;

    if (option.equals("n")){
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        names[i] = name;
        System.out.println("Enter a starting balance: ");
        double balance = input.nextDouble();
        balances[i] = balance;
        i++;
    } else if (option.equals("d")){
        System.out.println("Please enter the name to see the balance: ");
        String name = input.nextLine();
        double balance = balances[Arrays.asList(names).indexOf(name)];
        //applied format to display $0.00
        System.out.printf("Balance for " + name + " is $" + "%.2f ",balance);
    } else if (option.equals("q")){
        System.out.println("Thanks for using our bank service");
        break;
    } else {
        System.out.println("Invalid option");
    }
    }

}
//added main method
public static void main(String[] args){
    bankAccount();
}

}
