package com.Kamesh.projects.PractisingJavaDataTypes;

public class WrapperClass4
{
	public static void main(String[] args)
	{
		byte a=10;
		short b=20;
		long c=30;
		int d=40;
		float e=50.5f;
		double f=60.6;
		char g='K';
		boolean h=false;
		Byte a1=new Byte(a);
		System.out.println("Wrapped byte value:"+a);
		Short b1=new Short(b);
		System.out.println("Wrapped Short value:"+b);
		Long c1=new Long(c);
		System.out.println("Wrapped Long value:"+c);
		Integer d1= new Integer(d);
		System.out.println("Wrapped Integer value:"+d);
		Float e1=new Float(e);
		System.out.println("Wrapped Float value:"+e);
		Double f1=new Double(f);
		System.out.println("Wrapped Double value:"+f);
		Character g1=new Character(g);
		System.out.println("Wrapped Character value:"+g);
		Boolean h1=new Boolean(h);
		System.out.println("Wrapped Boolean value:"+h);
	}
}
