import java.util.Scanner;

public class view {
            controller controller = new controller();
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);

    public void showMenu(){

//Student1321247
        System.out.println("=================================");
        System.out.println("|            (づ ◕‿◕ )づ         |");
        System.out.println("|      CHECKBOOK PROGRAM        |");
        System.out.println("|           (Main Menu)         |");
        System.out.println("==================================");
        System.out.println("''                             ''");
        System.out.println("'' To Continue Pls Choose From ''");
        System.out.println("'' Options Below !!            ''");
        System.out.println("''                             ''");
        System.out.println("''-----------------------------''");
        System.out.println("''  1.) Withdraw               ''");
        System.out.println("''  2.) Deposit                ''");
        System.out.println("''  3.) Check Balance          ''");
        System.out.println("''  4.) Exit                   ''");
        System.out.println("''  5.) Our Details            ''");
        System.out.println("''                             ''");
          System.out.print("'' CHOICE = ");
        int input = scanner.nextInt();
        switch (input){
            case 1: withdraw();
            break;
            case 2: deposit();
            break;
            case 3: checkBalance();
            break;
            case 4: System.exit(0);
            break;
            case 5 : ourDetails();
        }
    }

    public void withdraw(){

        System.out.println("||=============================||");
        System.out.println("||            WITHDRAW         ||");
        System.out.println("||=============================||");
        System.out.print("'' INPUT AMOUNT = $");
        int input = scanner.nextInt();
        System.out.println("enter 'y' to confirm the WITHDRAWAL of $"+input+" Press any key to decline");
        String confirm = scanner.next();
        if(confirm.equalsIgnoreCase("y")){
        if(controller.withdraw(input)){
            System.out.println("");
            System.out.println("Successful (•‿•)");
            System.out.println("");
            checkBalance();
        }else{
            System.err.println("(ᗒᗣᗕ)՞ Insufficient Balance Pls Deposit First");
            deposit();
        }

        }else{
            showMenu();
        }

    }
    public void deposit(){
        System.out.println("||=============================||");
        System.out.println("||            DEPOSIT          ||");
        System.out.println("||=============================||");
         System.out.print("'' INPUT AMOUNT = $");
        int input = scanner.nextInt();
        System.out.println("enter 'y' to confirm the DEPOSIT of $"+input+" Press any key to decline");
        String confirm = scanner.next();
        if(confirm.equalsIgnoreCase("y")){
            if(controller.deposit(input)){
                System.out.println("");
                System.out.println("Your money has been deposited successfully (•‿•)");
                System.out.println("");
                checkBalance();
            }else{
                System.err.println("(ᗒᗣᗕ)՞An error Pls try again");
                deposit();
            }
        }else{
            showMenu();
        }


    }
    public void checkBalance(){
        System.out.println("||=============================||");
        System.out.println("||            BALANCE          ||");
        System.out.println("||=============================||");
        System.out.println("''                             ''");
        System.out.println("'' $"+controller.checkBalance());
        System.out.println("enter yes/y to return to the main menu OR any key to exit....");
        String input = scanner.next();
        if(input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            showMenu();
        }else {
            System.exit(0);
        }

    }

    public void ourDetails(){
        System.out.println("||=============================||");
        System.out.println("||          (๑☆‿ ☆#)ᕗ         ||");
        System.out.println("||       OUR INFORMATION       ||");
        System.out.println("||=============================||");
        System.out.println("''                             ''");
        System.out.println("'' Full Name: AUSTIN-ILAGHA    ''");
        System.out.println("'' FAITHFUL                    ''");
        System.out.println("''                             ''");
        System.out.println("'' ID: Student1321247          ''");
        System.out.println("''-----------------------------''");
        System.out.println("''                             ''");
        System.out.println("'' Full Name: CYRIL AKPOROBARO ''");
        System.out.println("'' UGBODUME                    ''");
        System.out.println("''                             ''");
        System.out.println("'' ID: Student1321239          ''");
        System.out.println("''-----------------------------''");
        System.out.println("enter yes/y to return to the main menu OR any key to exit....");
        String input = scanner.next();
        if(input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            showMenu();
        }else {
            System.exit(0);
        }

    }
}
