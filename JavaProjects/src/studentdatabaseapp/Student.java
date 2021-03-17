package studentdatabaseapp;


import java.util.Scanner;

public class Student {

private String userName;
private int numberOfStudents;
private int studentYear;
private String studentNumber;
Scanner in = new Scanner (System.in);

//////////////////Constructor to get number of students 
public Student (){
	String userName = this.userName;
	int studentYear = this.studentYear;
	String studentNumber = this.studentNumber;
	
	//call a method to get the number of students 
	this.numberOfStudents = getNumberOfStudents();
	
	//Call a method to ask user the name of student
	this.userName = getUserName();
	//Call method to get the grade of the student 
	this.studentYear = getStudentYear();
	//call method to get student number
	this.studentNumber = getStudentNumber();
	
	//Call method to display  user information 
	displayStudentInfo(userName, studentYear, studentNumber);
	
}
/////////////////End Constructor 

//Get the number of students being entered
public int getNumberOfStudents()  {
	System.out.println("Enter number of Students: ");
	 int numStudents = in.nextInt();
	//int numStudents = in;
	//in.close();															//Close scanner to prevent memory leak
	return numStudents; 
	
}

//Get the name of the student(s)
public String getUserName(){
	in = new Scanner (System.in);

	System.out.println("Enter Student Name: ");
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
  //studentYear.toString();
  in.close(); //Close
  return studentYear;
 }
 
 //Display student info 
 public void displayStudentInfo(String userName, int studentYear, String studentNumber) {
	String userName1 = this.userName;
	int stuYear = this.studentYear;
	String stuNum = this.studentNumber;
	
	System.out.println("Name" + "              " +  "Year" +"            " + "Student Number");
	System.out.println(userName1 + "           " + stuYear + "               " + stuNum);
	 
	 
	 return;
 }
 

}
