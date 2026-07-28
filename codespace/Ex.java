class Ex1{
	private String name;
	private int marks;
	
	public String getname(){
		return name;
	}
	public int getmarks(){
		return marks;
	}
	public void setname(String name){
		this.name = name;
	}
	public void setmarks(int marks){
		if(marks >= 0 && marks <=100){
			this.marks = marks;
		}else{
			System.out.println("Invalid marks");
			
			}
		
	}
}
public class Ex{
	public static void main(String args[]){
		Ex1 obj = new Ex1();
		obj.setname("Ram");
		obj.setmarks(87);
		System.out.println(obj.getname());
		System.out.println(obj.getmarks());
	}
}