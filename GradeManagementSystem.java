//Importing
import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagementSystem{
	
	//Array List
	
	static ArrayList<Student> studentList= new ArrayList<>();
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String ar[]){
		
		int choice;
		
		//Creating Menu
		do{
			System.out.println("\n----- Student Grade System -----");
			System.out.println("1.Add a Student");
			System.out.println("2.Display All Students");
			System.out.println("3.Search Student by StudentID");
			System.out.println("4.Calculate Avarage Marks");
			System.out.println("5.Exit");
			System.out.print("Enter Your Choice within 1 to 5");
			
			choice=sc.nextInt();
			sc.nextLine();
			
			//Cheking Choice
			
			if(choice==1){
				
				addStudent();
				
			}else if (choice==2){
				
				displayAllStudent();
				
			}else if(choice==3){
				
				searchStudent();
				
			}else if(choice == 4){
				
				calculateAverage();
				
			}else if(choice ==5){
				
				System.out.println("Exited...! Good Bye...!");
			}else{
				System.out.println("Invalid Choice...! Please Try Again...!");
			}
				
		}while(choice!=5);
		
	}
	//Add Student
	
	public static void addStudent(){
		System.out.println("Enter Student ID: ");
		String st_id= sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String st_name=sc.nextLine();
		
		System.out.println("Enter Student Mark: ");
		double marks=sc.nextDouble();
		
		//create object
		
		Student st= new Student(st_id,st_name,marks);
		studentList.add(st);
		
		System.out.println("Student added successfully...!");
		
	}
	
	//Display Students
	public static void displayAllStudent(){
		if (studentList.isEmpty()){
			System.out.println("No students found in the system");
			return;
		}
		System.out.println("\n---List of All Student---");
		for(Student s : studentList){
			System.out.println("Student ID: "+s.getId()+"\n Student Name: "+s.getName()+"\n Marks: "+s.getMarks());
			
		}
	}
	
	//Search from IDLEntity
	
	public static void searchStudent(){
		if(studentList.isEmpty()){
			System.out.println("No students found in the system");
			return;
			
		}
		
		System.out.println("Enter the Student ID: ");
		String searchID= sc.nextLine();
		boolean found= false;
		
		for (Student s : studentList){
			//compare ID
			
			if(s.getId().equalsIgnoreCase(searchID)){
				System.out.println("\n Student Found");
				System.out.println("Student ID: "+s.getId()+"\n Name: "+s.getName()+"Marks: "+s.getMarks());
				found=true;
				break;
				
			}
		}
		
		if(!found){
			System.out.println("Student not found with ID: "+searchID);
		}
	}
	//Average
	
	public static void calculateAverage(){
		if(studentList.isEmpty()){
			System.out.println("No Student Available to Calculate Average");
			return;
		}
		double totalMarks=0;
		for(Student s: studentList){
			totalMarks+=s.getMarks();
			
		}
		double average =totalMarks/ studentList.size();
		System.out.println("\n Total Students: "+ studentList.size());
		System.out.println("Average Marks of all Students: "+ average);
	}
	
}