import java.util.Scanner;
public class culumative2
	{
			static String name;
			public static void main(String[] args)
		{
			runhello();
			runchoices();
		}
			public static void runhello()	{
			Scanner userInput=new Scanner(System.in);
			System.out.println("What is your name?");
			int random=(int)(Math.random()*2);
			name=userInput.nextLine();
			if(random==0)
				{
					System.out.println("Wow!" + name + "! I always loved that name.");
				}
			if(random==1)
				{
					System.out.println("That's such a great name!");
				}
			if(random==2)
				{
					System.out.println("I love that name!" + name + " is such a beautiful name!");
				}
		}
			public static void runchoices()	{				
			Scanner userIn=new Scanner(System.in);
			System.out.println("How many choices are you trying to decide between?");
			int choices=userIn.nextInt();
			String[] array=new String[choices];
			for(int runs=0;runs<choices;runs++)
				{
					Scanner userI=new Scanner(System.in);
					System.out.println("Please type out one choice!");
					String reply20=userI.nextLine();
					array[runs]=(reply20);
				}
			int ray=array.length;
			int random=(int)(Math.random()*ray);
			System.out.println("The choice that has been decided is," + array[random] + ", choose wisely " + name + "!");
		}
}