import java.util.Scanner;
class RangeofPrimeNumberUsingMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting Number : ");
		int start = sc.nextInt();

		System.out.print("Enter ending Number : ");
		int end = sc.nextInt();

		for(int a  = start ; a <= end; a++)
		{
			if(checkPrime(a))
			{
				System.out.println(a + " ");
			}
		}
	}

	public static boolean checkPrime(int num)
	{
		int i;

		for(i=2;i<num;i++)
		{
			if(num % i == 0)
			{
				break;
			}
		}

		if(num == i)
		{
			return true;
		}
		return false;
	}
}
