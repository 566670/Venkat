package com.inhertence.domain;

public class Test {
public static void main(String[] args) {
	
ObjeFctry o=new  ObjeFctry();
	Iprocess interFaIprocess=o.getinstanceOfInterfacee();
	Iprocess sample1=o.getinstanceOfSample1();
	Iprocess sample2=o.getinstanceOfSample2();
	sample2.doRun();
	sample1.doRun();
	interFaIprocess.doRun();
	System.out.println("heelloooo");
}	
}
