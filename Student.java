//Class
public class Student{
	
	//Encapsulation
	
	private String st_id;
	private String st_name;
	private double marks;
	
	//Constructor
	
	public Student(String st_id,String st_name,double marks){
		
		this.st_id=st_id;
		this.st_name=st_name;
		this.marks=marks;
		
	}
	
	//Getters and Setters
	//Getters
	public String getId(){
		return st_id;
		
	}
	public String getName(){
		return st_name;
	}
	public double getMarks(){
		return marks;
	}
	
	//Setters
	
	public void setId(String st_id){
		this.st_id=st_id;
	}
	
	public void setName(String st_name){
		this.st_name=st_name;
	}
	
	public void setMarks(double marks){
		this.marks=marks;
	}
	
}