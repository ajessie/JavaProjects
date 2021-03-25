package studentdatabaseapp;

import java.util.Scanner;

public class Student {
private String userName;
private int studentYear;
private String studentNumber;
private int answer;
private int counter_Enrollment;
private int counter_Dropped;
private int total_E;
private int total_Final_E;
private int credit;
private int totalTuitionCount;
private String course[] = new String [5];
private String dropped[] = new String[5];
Scanner in = new Scanner (System.in);

////////////////////Start Constructor//////////////////////////////////////////////
public Student (){
	//Call a method to ask user the name of student
	this.userName = getUserName();	
	//Call method to get the grade of the student 
	this.studentYear = getStudentYear();
	//call method to get student number
	this.studentNumber = getStudentNumber();
	//Call methods to display information to user
	displayMainMenu();	
}
////////////////////End Constructor//////////////////////////////////////////////// 
//Get the number of students being entered
public int getNumberOfStudents()  {
	System.out.println("Enter number of Students: ");
	 int numStudents = in.nextInt();													//Close scanner to prevent memory leak
	return numStudents; 
}
//Get the name of the student(s)
public String getUserName(){
	in = new Scanner (System.in);
	System.out.println("//////////Student Database////////");
	System.out.println("Enter Student First and Last Name");
	userName = in.nextLine();
    return userName;    
}
//Get Student ID Number
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
  System.out.println("Enter the year of the student: "); 
  in = new Scanner(System.in); 
  studentYear = in.nextInt();
  return studentYear;
 }
//Display student info to user
public void displayStudentInfo(String userName, int studentYear, String studentNumber) {
	String userName_2 = this.userName;
	int stuYear = this.studentYear;
	String stuNum = this.studentNumber;
	System.out.println("\n///////////////////////Student Information//////////////////////////////////\n");
	System.out.println("Name"     + "             " + "Year"   +   "              "     + "Student Number");
	System.out.println(userName_2 + "         " + stuYear      +   "                      " + stuNum);
	System.out.println("\n" + "                                               " + "Tuition Fees Due: " + totalTuitionCount + "\n");
	System.out.println("//////////////////////////////////////////////////////////////////////////////");
	 return;
 	}
//Enroll Student in course 
public void enrollStudent(){
	 System.out.println("/////////////Enter course to enroll [Q to quit]/////////\n ");
	 System.out.println("History 101 [HIST1001]" 
		 		+ "\nMathematics 1001 [MATH1001]" 
		 		+ "\nChemistry 1001 [CHEM1001]" 
		 		+ "\nEnglish 1001 [ENGL1001]"
		 		+ "\nComputer Science 1001 [COMP1001]");
	  
	 in = new Scanner (System.in);
	 String input = in.next();
	 	 
	 if(in.findAll("HIST1001"+ "MATH1001" + "CHEM1001" + "ENGL1001" + "COMP1001" + "Q") != null) {
		switch (input) {
				case "HIST1001":
				course[0] = "HIST1001";
				System.out.println("History 101 added\n");
				 break;
				 
				case "MATH1001":
				course[1] = "MATH1001";
				 System.out.println("Mathematics 101 added\n");
				 break;
				 
				case "CHEM1001":
					course[2] = "CHEM1001";
					System.out.println("Chemistry 101 added\n");
					break;
					
				case "ENGL1001":
					course[3] = "ENGL1001";
					System.out.println("English 101 added\n");
					break;
					
				case "COMP1001":
					course[4] = "COMP1001";
					System.out.println("Computer Science 101 added\n");
					break;	
					
				case "Q":
					course.clone().toString();
					System.out.println("//////////Enrolled Courses/////////");
						
						 for (int i = 0; i <course.length; i++) {
						   if (course[i] != null) {
							   System.out.println(course[i]);
							}
						}
					total_Final_E = calculateTotalEnrollment(counter_Enrollment);
					totalTuitionCount = total_E - credit;		
					System.out.println("Enrollment fees: " + total_Final_E + "\n");
					break;
			}
			switch (input) {	
				case "HIST1001":
				case "MATH1001":
				case "CHEM1001":
				case "ENGL1001":
				case "COMP1001":			
					counter_Enrollment++;
					enrollStudent();
					break;
			}
	 	}
	 displayMainMenu();
}
//Drop student from course
public void dropCourse() {
System.out.println("///////////////Enter course to drop [Q to quit]///////// \n");
System.out.println("History 101 [HIST1001]" 
		 		+ "\nMathematics 1001 [MATH1001]" 
		 		+ "\nChemistry 1001 [CHEM1001]" 
		 		+ "\nEnglish 1001 [ENGL1001]"
		 		+ "\nComputer Science 1001 [COMP1001]");

in = new Scanner (System.in);
String input = in.next();
	 
if(in.findAll("HIST1001"+ "MATH1001" + "CHEM1001" + "ENGL1001" + "COMP1001" + "Q") != null) {
		
	switch (input) {
			case "HIST1001":
				dropped[0] = "HIST1001";
				System.out.println("History 101 dropped\n");
				break;
			 
			case "MATH1001":
				dropped[1] = "MATH1001";
				 System.out.println("Mathematics 101 dropped\n");
				 break;
			 
			case "CHEM1001":
				dropped[2] = "CHEM1001";
				System.out.println("Chemistry 101 dropped\n");
				break;
				
			case "ENGL1001":
				dropped[3] = "ENGL1001";
				System.out.println("English 101 dropped\n");
				break;
				
			case "COMP1001":
				dropped[4] = "COMP1001";
				System.out.println("Computer Science 101 dropped\n");
				break;	
				
			case "Q":
				course.clone().toString();
				System.out.println("//////////Dropped Courses///////");
					
					for (int i =0; i <dropped.length; i++ ) {
						
					   if (dropped[i] != null) {
						   System.out.println(dropped[i]);
						}
					}	
				calculateTotalDropped(counter_Dropped, total_E);
				totalTuitionCount = total_E - credit;
				System.out.println("Credit: " + credit + "\n");
				break;
		}
		
	switch (input) {	
			case "HIST1001":
			case "MATH1001":
			case "CHEM1001":
			case "ENGL1001":
			case "COMP1001":
				counter_Dropped++;
				dropCourse();
				break;
			case "Q":
				displayMainMenu();
				break;
		}
	}
	displayMainMenu();
}
//Display the main menu to the user
public void displayMainMenu() {	
	System.out.println("Student Name: " + userName + "  " + "Student Number: " + studentNumber + "  " +  "Student Year: " + studentYear);
	System.out.println("\n/////////What would you like to do?///////////////");
	System.out.println("Enrollment [1]" + " " + "Drop Course [2]" + " " + "See Student Bill [3]");
	in = new Scanner(System.in);
	answer = in.nextInt();
	
	if (answer == 1) 
		enrollStudent();
	if (answer == 2)
		dropCourse();
	if (answer == 3) 
		displayStudentInfo(userName,studentYear, studentNumber);
}
//Calculate total tuition bill after enrollment
public int calculateTotalEnrollment(int counter_Enrollment) {
	total_E = counter_Enrollment * 600;
		 return total_E;
}
//Calculate the total bill after dropped courses
public int calculateTotalDropped(int counter_Dropped, int total_E){
	int total_D;
	total_D = counter_Dropped * 600;
	credit = total_D;
	
	 	return credit;
 }
}