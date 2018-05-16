
import java.util.*;
public class Bank {
  public static void main(String[] args) {
    
    final int MAX_ACCOUNTS = 10;

    // Create an array to store the bank accounts
    BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    // numAccounts is the number of accounts currently in
    // existence. current is the array index of the currently
    // selected account (or -1 if no account is currently
    // selected).
    int numAccounts = 0;
    int current = -1;
    double balance = 0;
    // Read and execute commands
    while (true) {

      // Display list of commands
      System.out.println(
        "-------------------------------------------------\n" +
        "|Commands: o - Open account    c - Close account|\n" +
        "|          d - Deposit         w - Withdraw     |\n" +
        "|          s - Select account  q - Quit         |\n" +
        "-------------------------------------------------");

      // Display the current account number and balance
      System.out.print("Current account: ");
      if (current != -1) {
        System.out.print(accounts[current].getNumber() +
                         "  Balance: $");

        // Round the balance to the nearest cent
        long balanceInCents = Math.round(accounts[current].getBalance() * 100);

        // Display the balance as dollars and cents, adding
        // a leading zero if the cents is a one-digit number
        System.out.print(balanceInCents / 100 + ".");
        long cents = balanceInCents % 100;
        if (cents < 10)
          System.out.print("0");
        System.out.println(cents);
      } else
        System.out.println("None selected");
      System.out.println();

      // Prompt the user to enter a command
      Scanner stdin = new Scanner(System.in);
      System.out.print("Enter command: ");
      String command = stdin.nextLine().trim();
       
      // Use an if else statement to determine which
      // command was entered
      if (command.equalsIgnoreCase("o")) 
	{
        // *** Open command ***
        // If the accounts array is full, tell user no more allowed 
	if (numAccounts == 10) 
			{
		System.out.print("Sorry, no more accounts can me created at this time.");
			}
		
	// Ask user for new account number and initial balanace
		System.out.print("Enter new account number: ");
                String accountNumber = stdin.nextLine();
                System.out.print("Enter initial account balance: ");
		String initial_balance = stdin.nextLine().trim();
		


        // Create a new BankAccount object and store it in the
        // accounts array.  Increment the number of accounts.
		double initialbalance = Double.parseDouble(initial_balance);
		accounts[numAccounts] = new BankAccount(accountNumber, initialbalance);
		current = numAccounts;
		numAccounts++;
		balance = initialbalance;
	}
      
	else if (command.equalsIgnoreCase("c")) 
		{
			// *** Close command ***
			if (current != -1)
				{
					accounts[current] = accounts[--numAccounts];
					current = -1;
				}
			else
				{
					System.out.print("Please select an account: ");
				}
		} 
	
	else if (command.equalsIgnoreCase("d")) 
		{
			// *** Deposit command ***
			if (current != -1)
				{
					System.out.print("Enter amount to deposit: ");
					String depositamount = stdin.nextLine().trim();
					double deposit_amount = Double.parseDouble(depositamount);
					accounts[current].deposit(deposit_amount);
					balance = balance + deposit_amount;
				}
			else
				{
				System.out.print("Please select an account: ");
				}
		}	 

	else if (command.equalsIgnoreCase("w")) 
		{
			// *** Withdraw command ***
			if (current != 1)
				{
					System.out.print("Enter amount to withdraw: ");
					String withdrawalamount = stdin.nextLine().trim();
					double withdrawal_amount = Double.parseDouble(withdrawalamount);
					accounts[current].withdraw(withdrawal_amount);
					balance = balance - withdrawal_amount;
				}
			else
				{
					System.out.print("Please select an account: ");
				}
		}
	
	else if (command.equalsIgnoreCase("s")) 
		{
			// *** Select command ***;
			System.out.print("Enter account number: ");
			int select = stdin.nextInt();
			current = select - 1;
			if (select == numAccounts)
				{
					System.out.print("Account number was not found");
				}
		} 
	
	else if (command.equalsIgnoreCase("q")) 
		{
			return;
		} 

	else 
		{
			// *** Illegal command ***
       			System.out.print("Command was not recognized, please try again.");	
		}
	

    }
  } 
} 

