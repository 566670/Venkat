package com.inhertence.domain;

public class Interfceee  implements Iprocess{
public void doRun()
{
System.out.println("doRun of Interfacee");	
}

public Iprocess getinstanceOfSample1()
	{
		return new Sample1();
	}
	public Iprocess getinstanceOfSample2()
	{
		return new Sample2();
	}
	public Iprocess getinstanceOfInterfacee()
	{
		return new Interfceee();
	}

}
