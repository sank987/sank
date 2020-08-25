package com.hefshine.iterations;

public class Q12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		for (int i = 1; i <= 5; i++)
		{

			for (int j = 1; j <= 5; j++)
			{
				
				if (i % 2 == 0)
				{

					if (j % 2 == 0)
					{
						System.out.print("1");

					} else
					{
						System.out.print("0");
					}

				}
			else 
					{

						if (j % 2 == 0)
						{
							System.out.print("0");

						} else
						{
							System.out.print("1");
						}

					}
				}

				System.out.println();
			}

		}
	}

/*
 * if(k == 1) { System.out.print("1"); } else { System.out.print("0"); } k=k *
 * -1; } System.out.println(); } }
 */