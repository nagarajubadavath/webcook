import java.util.*;


class AccountHolders{
	private long account_no;
	private String name;
	private int pin_number;
	private int amount;
	AccountHolders(long account_no,String name,int pin_number,int amount)
	{
		this.account_no=account_no;
		this.name=name;
		this.pin_number=pin_number;
		this.amount=amount;
	}
	static void Banking(AccountHolders[] accountHolders)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the pin number");
		int pin=scan.nextInt();
		boolean authenticated=false;
		for(int i=0;i<accountHolders.length;i++)
		{
			if(accountHolders[i].pin_number==pin)
			{
				authenticated=true;
				System.out.println();
				int choose;
				do{
					System.out.println("enter 1 for check balance");
					System.out.println("enter 2 for deposit funds");
					System.out.println("enter 3 for withdraw balance");
					System.out.println("enter 4 to tranfer to another account");
					System.out.println("enter -1 for exit");
					choose=scan.nextInt();
					switch(choose)
					{
						case 1:System.out.println(accountHolders[i].amount);
								break;
						case 2:System.out.println("enter the amount to deposit");
								int cash=scan.nextInt();
								accountHolders[i].amount+=cash;
								System.out.println("Amount is deposited successfully");
								break;
						case 3:System.out.println("enter the amount to be withdrawn");
								int withdraw_amount=scan.nextInt();
								if(accountHolders[i].amount<withdraw_amount)
								{
									System.out.println("Account Balance is insufficient");
								}else{
									accountHolders[i].amount-=withdraw_amount;
									System.out.println("Withdraw is successfull");
								}
								break;
						case 4:System.out.println("enter the account number to transfer the amount");
								long acc_num=scan.nextLong();
								boolean found=false;
								for(int j=0;j<accountHolders.length;j++)
								{
									int k=i;
									if(acc_num==accountHolders[j].account_no)
									{
										found=true;
										System.out.println("enter the money");
										int money=scan.nextInt();
										if(money<=accountHolders[k].amount){
										accountHolders[j].amount+=money;
										System.out.println("Transfered to another account");
										accountHolders[k].amount-=money;
										}else{
											System.out.println("Amount is less to transfer");
										}
									}
								}
								if(!found){
									System.out.println("your provided account number is not present");
								}
								break;
						case -1:System.out.println("Bye!");
					}
				}while(choose!=-1);
			}
		}
		if(!authenticated)
		{
			System.out.println("Incorrect pin_number have been entered");
		}
	}

}
class ATMinterface{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to virtual Banking System");
		AccountHolders[] details=new AccountHolders[2];
		details[0]=new AccountHolders(555,"Nagaraju",1111,0);
		details[1]=new AccountHolders(556,"Raj",2222,0);
		AccountHolders.Banking(details);
	}
}