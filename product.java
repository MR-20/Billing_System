package Billing_System_Advance;
import java.util.*;
public class product {
	
Scanner sc=new Scanner(System.in);
void get_Data() 
{
	int sum=0;
	char n='N';
	int ProductPrice[]= new int[n];
	String ProductName[]=new String[n];
	
	int i=0;
	int size=0;
	System.out.println("Enter Product Name: ");
	ProductName[i]=sc.next();
	System.out.println("Enter " +ProductName[i]+" Price: ");
	ProductPrice[i]=sc.nextInt();

//	for(int j=0;j<=size;j++) 
//	{
//			char Q;
//			System.out.println("Add more Product Y/N: ");
//			Q=sc.next().charAt(0);
//			if(Q=='y') 
//	{			
//			System.out.println("Enter Product Name: ");
//			ProductName[i+1]=sc.next();
//			System.out.println("Enter " +ProductName[i+1]+" Price: ");
//			ProductPrice[i+1]=sc.nextInt();
//			i++;
//			size++;
//		
//	}
//			else
//	{
//			j=size;
//	}
//	}
	char Q='d';
	switch(Q) {
	
	case 'd':
		for(int j=0;j<=size;j++) 
		{
				char r;
			System.out.println("Add more Product Y/N: ");
			r=sc.next().charAt(0);
				if(r=='y') 
		{			
				System.out.println("Enter Product Name: ");
				ProductName[i+1]=sc.next();
				System.out.println("Enter " +ProductName[i+1]+" Price: ");
				ProductPrice[i+1]=sc.nextInt();
				i++;
				size++;
				
			
		}
				else
		{
				j=size;
		}
		}
		break;
	
	
	}
	
			for(int a = 0;a<=i;a++) 
			{
			sum=sum+ProductPrice[a];				
			}
	

	System.out.println("Add GST y/n : ");
	String Select=sc.next();
	switch(Select) {
	
	case "y" :System.out.println("Enter GST % : ");
				int gst=sc.nextInt();
				int gsti=sum*gst/100;
				int total=gsti+sum;
					System.out.println("==========================");
					System.out.println("        Restaurent        ");
					System.out.println("==========================");
				
					for(int b =0 ; b<=i;b++) {
					
					System.out.println((b+1)+"     "+ProductName[b]+"    "+ProductPrice[b]+"/-");
					
					System.out.println("--------------------------");
				}
				System.out.println("GST            = "+gst+"%");
				System.out.println("Total          = "+sum);
				System.out.println("Total GST      = "+gsti);
				System.out.println("==========================");
				System.out.println("Bill Amount Rs = "+total);
				System.out.println("==========================");
	break;
	case "n" :
				System.out.println("==========================");
				System.out.println("        Restaurent        ");
				System.out.println("==========================");
				
				for(int b =0 ; b<=i;b++) 
				{
				
				System.out.println((b+1)+"     "+ProductName[b]+"    "+ProductPrice[b]+"/-");
				System.out.println("--------------------------");
			}
			System.out.println("Bill Amount  Rs = "+sum);
			System.out.println("==========================");
		break;
		
	}
}
	
	
	
//	for(int m=0;m<=i;m++) {
//		p.get_Product(ProductName[i], ProductPrice);
//	System.out.println(ProductName(ProductName[m])+" "+ProductPrice(ProductPrice[m]));

//	}
///	System.out.println("Total Amount : "+sum);
	




	
			String ProductName(String name)
	{
			return name;
	}

			int ProductPrice(int price)
			{
			return price;
	
	
	}
	}
