package studentdatabaseapp;


import java.util.Scanner;

public class Student {

private String userName;
private int studentYear;
private String studentNumber;
private int answer;
private int counter;
Scanner in = new Scanner (System.in);

//////////////////Constructor////////////////////////////////
public Student (){
	String userName = this.userName;
	int studentYear = this.studentYear;
	String studentNumber = this.studentNumber;
	
	//Call method to get the number of students
	getNumberOfStudents();
	//Call a method to ask user the name of student
	this.userName = getUserName();
	
	//Call method to get the grade of the student 
	this.studentYear = getStudentYear();
	
	//call method to get student number
	this.studentNumber = getStudentNumber();
	
	//Call method to display  user information 
	displayStudentInfo(userName, studentYear, studentNumber);
	
	//Ask user if they would like to enroll a student
	displayMainMenu();
	
}
/////////////////End Constructor//////////////////////////////////////////////// 

//Get the number of students being entered
public int getNumberOfStudents()  {
	System.out.println("Enter number of Students: ");
	 int numStudents = in.nextInt();													//Close scanner to prevent memory leak
	return numStudents; 
	
}

//Get the name of the student(s)
public String getUserName(){
	in = new Scanner (System.in);

	System.out.println("Enter Student First and Last Name");
	userName = in.nextLine();

    return userName;    
}

//Get the students' ID number
public String getStudentNumber(){
  String idSet = "123456789"; char
  studentNumber[] = new char [5];
  for (int i=0; i<5; i++)
  { int rand = (int)(Math.random() * idSet.length()); 
  studentNumber[i] = idSet.charAt(rand);
  } 
  return new String (studentNumber); 
}
 
//Get the year of the student
 public int getStudentYear() {
  System.out.println("Enter the year of the student: "); in = new
  Scanner(System.in); 
   studentYear = in.nextInt();
  return studentYear;
 }
 
 //Display student info 
 public void displayStudentInfo(String userName, int studentYear, String studentNumber) {
	String userName_2 = this.userName;
	int stuYear = this.studentYear;
	String stuNum = this.studentNumber;
	
	System.out.println("Name" + "              " +  "Year" +"            " + "Student Number");
	System.out.println(userName_2 + "           " + stuYear + "               " + stuNum);
	 
	 
	 return;
 	}
 
 //Enroll Student in course 
 public void enrollStudent() {
	 System.out.println("History 101 [HIST1001]" 
			 		+ "\nMathematics 1001 [MATH1001]" 
			 		+ "\nChemistry 1001 [CHEM1001]" 
			 		+ "\nEnglish 1001 [ENGL1001]"
			 		+ "\nComputer Science 1001 [COMP1001\n");
	 
	 System.out.println("Enter course to enroll [Q to quit]: ");
	  
	 in = new Scanner (System.in);
	 String input = in.next();
	 int total;
	 
		switch (input)
		{
				case "HIST1001":
						 
				 System.out.println("History 101 added\n");
				 //counter++;
				 break;
				 
				case "MATH1001":
				 System.out.println("Mathematics 101 added\n");
				 //counter++;
				 break;
				 
				case "CHEM1001":
					System.out.println("Chemistry 101 added\n");
					//counter++;
					break;
					
				case "ENGL1001":
					System.out.println("English 101 added\n");
					//counter++;
					break;
					
				case "COMP1001":
					System.out.println("Computer Science 101 added\n");
					//counter++;
					break;	
	}
		switch (input) {
			
		case "HIST1001":
		case "MATH1001":
		case "CHEM1001":
		case "ENGL1001":
		case "COMP1001":
			counter++;
			break;
			
		case "Q":
			System.out.println("Program Ended");
			total = calculateTotal(counter);
			System.out.println("Total Tuition: " + total);
			displayMainMenu();
		}
		enrollStudent();
}

//Display "main menu"
 public void displayMainMenu() {
	System.out.println("\nWhat would you like to do?\n ");
	System.out.println("Enrollment [1]" + "\nDrop Course [2]" + "\nSee Student Bill [3]");
	in = new Scanner(System.in);
	answer = in.nextInt();
	
	if (answer == 1) 
		enrollStudent();
	if (answer == 2)
		System.out.println("Drop Course");	
 	
 	}

//Calculate total tuition bill after enrollment
 public int calculateTotal(int counter) {
		 int total;
		 //counter = this.counter;
		 total = counter * 600;
		 return total;
 	}
}

