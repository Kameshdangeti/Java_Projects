package com.Kamesh.projects.PractisingJavaApi;

public class StringBufferClass 
{
   public static void main(String[] args) 
   {
	    StringBuffer s1= new StringBuffer("Java");
	    StringBuffer s2= new StringBuffer("Programming");
	    System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1 :"+s1.hashCode());
		System.out.println("s2 :"+s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.append("Developer"));
		System.out.println("Changed s1:"+s1.hashCode());
   }
}
