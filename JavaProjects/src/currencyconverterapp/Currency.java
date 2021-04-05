package currencyconverterapp;

import java.util.Scanner;

public class Currency {

private double convertedValue;
private double startCurrency;
private String convertFrom;
private String convertTo;
Scanner in = new Scanner (System.in);

//Constructor 
public Currency() {
	//Call method to get starting currency and desired conversion
	getCurrency();
	String convertTo = this.convertTo;
	//Call method to do conversion
	convertedValue(convertTo);
	System.out.println(convertedValue + "" + this.convertTo);
	}
//Get conversion units
public String getCurrency() {
	System.out.println("Enter starting currency denomination: ");
	System.out.println("Select From: ");
	System.out.println("us dollar\n"
					  +"yen\n"
					  +"pound\n"
					  +"canadian dollar\n"
					  +"swiss franc");
	in = new Scanner(System.in);
	convertFrom = in.nextLine();
	
	switch(convertFrom) {
	
	case "us dollar": case "US DOLLAR": case "US dollar": case "US Dollar":
	case "yen": case "Yen": case "YEN":
	case "pound": case "Pound": case "POUND":
	case "canadian dollar": case "Canadian dollar": case " CANADIAN DOLLAR":
	case "swiss franc": case "Swiss franc": case "SWISS FRANC":
		System.out.println("Starting currency: " + convertFrom + "\n");
		break;
	}
	System.out.println("Select currency to convert to: ");
	System.out.println("us dollar\n"
					  +"yen\n"
					  +"pound\n"
					  +"canadian dollar\n"
					  +"swiss franc");
	in = new Scanner(System.in);
	convertTo = in.nextLine();
	
	switch (convertTo) {
	
	case "us dollar": case "US DOLLAR": case "US dollar": case "US Dollar":
	case "yen": case "Yen": case "YEN":
	case "pound": case "Pound": case "POUND":
	case "canadian dollar": case "Canadian dollar": case " CANADIAN DOLLAR":
	case "swiss franc": case "Swiss franc": case "SWISS FRANC":
		System.out.println("\nConverting: " + convertFrom 
											+ "\nTo: " 
											+ "        "
											+ convertTo);
		break;
		}
	return convertTo;
	}
//Calculate new converted amount
public double convertedValue(String convertTo) {
	
	System.out.println("Enter starting amount: ");
	in = new Scanner(System.in);
	startCurrency = in.nextDouble();
	switch(convertTo) {
	
	case "us dollar": case "US DOLLAR": case "US dollar": case "US Dollar":
		convertedValue = startCurrency * 1.1746;
		break;
	}
		return convertedValue;
	}
}