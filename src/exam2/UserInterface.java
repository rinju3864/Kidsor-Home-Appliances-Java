package exam2;


import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill Code
		String pId,pName,bId,bName,dDate,qlty;
		int wYrs;
		double qty,price=0;
		System.out.println("Enter Product Id");
		pId=sc.next();
		System.out.println("Enter Product Name");
		pName=sc.next();
		if(pName.equals("AirConditioner")||pName.equals("LEDTV")||pName.equals("MicrowaveOven"))
		{
			System.out.println("Enter Batch Id");
			bId=sc.next();		
			System.out.println("Enter Dispatch date");
			dDate=sc.next();		
			System.out.println("Enter Warranty Years");
			wYrs=sc.nextInt();
			if(pName.equals("AirConditioner"))
			{
				String acType;
				System.out.println("Enter type of Air Conditioner");
				acType=sc.next();	
				System.out.println("Enter quantity");
				qty=sc.nextDouble();	
				AirConditioner aObj=new AirConditioner(pId, pName, bId, dDate, wYrs, acType, qty);
				price=aObj.calculateProductPrice();
			}
			else if(pName.equals("LEDTV"))
			{
				int size;
				System.out.println("Enter size in inches");
				size=sc.nextInt();	
				System.out.println("Enter quality");
				qlty=sc.next();	
				LEDTV lObj= new LEDTV(pId, pName, bId, dDate, wYrs, size, qlty);
				price=lObj.calculateProductPrice();
			}
			else if(pName.equals("MicrowaveOven"))
			{
				System.out.println("Enter quantity");
				qty=sc.nextDouble();	
				System.out.println("Enter quality");
				qlty=sc.next();	
				MicrowaveOven mObj=new MicrowaveOven(pId, pName, bId, dDate, wYrs, wYrs, qlty);
				price=mObj.calculateProductPrice();
			}
			System.out.println("Price of the Product is "+String.format("%.2f",price));
		}
		else
		{
			System.out.println("Provide a valid Product name");
		}
		
	}

}
