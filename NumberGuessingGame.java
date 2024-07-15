import java.util.*;
import java.util.Random;



class NumberGuessingGame{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		int min=0;
		int max=100;
		int points=10;
		int flag=0;
		int randomInteger=random.nextInt((max-min)+1);
		int guessed_num=0;
		//System.out.println(randomInteger);
		System.out.println("Total of 10 attempts & for each incorrect guess -1 and 0 to 100 nums included");
		for(int i=1;i<=10;i++)
		{
			System.out.println("This is your "+i+"th guess go on");
			guessed_num=scan.nextInt();
			if(randomInteger==guessed_num)
			{
				flag=1;
				break;
			}else if(randomInteger>guessed_num)
			{
				System.out.println("your guessed number "+guessed_num+" is too small");
			}
			else{
				System.out.println("your guessed number "+guessed_num+" is too large");
			}
			points--;
			if(flag==0 && i>10)
			{
				System.out.println("your points are "+points);
			}
		}
		if(flag==1){
			System.out.println("your points are "+points);
		}

	}
}