//Below we written code for Applying the static Keyword to methods And Fields.
//Here the main method for this code is called seperately,
//i.e.,"Person_main.java".
package Encapsulation;

public class Person
{
		public String Name;
	    public   int rollno;
		static String clgname;
		static int counter=0;

		public Person(String name) 
		{
			super();
			this.Name = name;
			this.rollno = setRollno();
		}
		static int setRollno() 
		{
			counter++;
			return counter;
		}

	    static void setclg(String name)
	    {
	    	clgname=name;
	    }
	    public void getPersoninfo()
		{
			System.out.println("Person Name :"+this.Name);
			System.out.println("Person Rollno:"+this.rollno);
			System.out.println("Person college name:"+clgname);
		}  
}
	


