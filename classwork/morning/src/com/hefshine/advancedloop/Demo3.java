package com.hefshine.advancedloop;

public class Demo3 {

	/**
 11111
 1111
  111
   11
    1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0,i=0;
		for(int j=5;j>=1;j--)
		{
			for( i=5;i>j;i--)
			{
				System.out.print(" ");
			}
		for( i=1;i<=j;i++)
		{
			count=count+1;
			
			System.out.print(1);
		}
		System.out.println();
		}


	}

}

/*for(i=N; i>=1; i--)
{
    // Logic to print spaces
    for(j=N; j>i; j--)
    {
        printf(" ");
    }

    // Logic to print numbers
    for(j=1; j<=i; j++)
    {
        printf("%d", i);
    }

    printf("\n");
}
*/