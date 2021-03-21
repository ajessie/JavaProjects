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
private int total_Refund;
private String course[] = new String[5];
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
//Get student name
//Get the name of the student(s)
public String getUserName(){
	in = new Scanner (System.in);

	System.out.println("Enter Student First and Last Name");
	userName = in.nextLine();

    return userName;    
}
//Get Student ID Number
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
//Get grade of student
//Get the year of the student
 public int getStudentYear() {
  System.out.println("Enter the year of the student: "); in = new
  Scanner(System.in); 
   studentYear = in.nextInt();
  return studentYear;
 }
//Display student info to user
 //Display student info 
 public void displayStudentInfo(String userName, int studentYear, String studentNumber) {
	String userName_2 = this.userName;
	int stuYear = this.studentYear;
	String stuNum = this.studentNumber;
	
	System.out.println("\n///////////////////////Student Information///////////////////////////");
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
	 	 
	 if(in.findAll("HIST1001"+ "MATH1001" + "CHEM1001" + "ENGL1001" + "COMP1001") != null) {
		switch (input)
		{
		
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
					System.out.println("Program Ended");
					System.out.println("Enrolled Courses: \n");
					
					for (int i=0; i < course.length; i++) {
						
					   if (course[i] != null) {
						   System.out.println(course[i]);
						}
					}
					
					total_Final_E = calculateTotalEnrollment(counter_Enrollment)			;		
					System.out.println("Enrollment fees: " + total_Final_E);
					displayMainMenu();
				
			}
		switch (input) {
			
		case "HIST1001":
		case "MATH1001":
		case "CHEM1001":
		case "ENGL1001":
		case "COMP1001":
			counter_Enrollment++;
			break;
		}
		
		enrollStudent();
	 }
 }
//Drop a student from a course
 //Drop student from course
 public void dropCourse(int counter_Dropped) {
	 
	 System.out.println("History 101 [HIST1001]" 
		 		+ "\nMathematics 1001 [MATH1001]" 
		 		+ "\nChemistry 1001 [CHEM1001]" 
		 		+ "\nEnglish 1001 [ENGL1001]"
		 		+ "\nComputer Science 1001 [COMP1001\n");

System.out.println("Enter course to drop [Q to quit]: ");

in = new Scanner (System.in);
String input = in.next();
	 
if(in.findAll("HIST1001"+ "MATH1001" + "CHEM1001" + "ENGL1001" + "COMP1001") != null) {
	switch (input)
	{
	
			case "HIST1001":
			course[0] = "History 101 dropped";
			System.out.println("History 101 dropped\n");
			 break;
			 
			case "MATH1001":
			course[1] = "Math dropped";
			 System.out.println("Mathematics 101 dropped\n");
			 break;
			 
			case "CHEM1001":
				course[2] = "CHEM1001";
				System.out.println("Chemistry 101 dropped\n");
				break;
				
			case "ENGL1001":
				course[3] = "ENGL1001";
				System.out.println("English 101 dropped\n");
				break;
				
			case "COMP1001":
				course[4] = "COMP1001";
				System.out.println("Computer Science 101 dropped\n");
				break;	
				
			case "Q":
				course.clone().toString();
				System.out.println("Program Ended");
				System.out.println("Dropped Courses: \n");
				
				for (int i=0; i < course.length; i++) {
					
				   if (course[i] != null) {
					   System.out.println(course[i]);
					}
				}
				
				total_Refund = calculateTotalDropped(counter_Dropped, total_E);
				System.out.println("Credit: " + total_Refund);
				displayMainMenu();
			
		}
	switch (input) {
		
	case "HIST1001":
	case "MATH1001":
	case "CHEM1001":
	case "ENGL1001":
	case "COMP1001":
		counter_Dropped++;
		break;
	}
	
	dropCourse(counter_Dropped);
}
 }
 //Display the main menu to the user
//Display "main menu"
 public void displayMainMenu() {
	System.out.println("\nWhat would you like to do?");
	System.out.println("Enrollment [1]" + "\nDrop Course [2]" + "\nSee Student Bill [3]");
	in = new Scanner(System.in);
	answer = in.nextInt();
	
	if (answer == 1) 
		enrollStudent();
	if (answer == 2)
		dropCourse(counter_Dropped);	
 	
 	}
//Calculate the total bill for the student
//Calculate total tuition bill after enrollment
 public int calculateTotalEnrollment(int counter_Enrollment) {
		 int total_E;
		 //counter = this.counter;
		 
			 total_E = counter_Enrollment * 600;
		 return total_E;
 	}
 
 //Calculate the total bill after dropped courses
 public int calculateTotalDropped(int counter_Dropped, int total_E){
	 int total_D;
	 int credit;
	 total_D = counter_Dropped * 600;
	 credit = total_D - total_E;
	 
	 return credit;
 }
}

