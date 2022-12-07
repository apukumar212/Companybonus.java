package com.pack1;
/*Q-A company decide to give bonus of 5% to employee If his/her 
  year of service is more than 5 years, Take a parameterised 
  method which takes users, salary and year of service and 
  Print bonus amount and updated salary.   */
public class Companybonus
{
void emp(int sal,int year)
{
	if(year>5)
	{
		System.out.println("Congrats...! your total year of service more than 5year");
	    System.out.println("your 5% bonus is..rs "+sal*0.05);
	    System.out.println("your net bonus with salary is:rs"+(sal + (sal*0.05)));
    }
  else
      {
      System.out.println("sorry no bonus");
      }
      }
public static void main(String[]args)
{
	new Companybonus().emp(10000, 6);
}
}


