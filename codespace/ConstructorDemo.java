class Box{
	double length,width,height;
	Box(){
		length=width=height=-1;
	}
	Box(double len,double wid,double ht){
		length = len;
		width = wid;
		height = ht;
	}
	void volume(){
		System.out.println(length*width*height);
	}
}
class ConstructorDemo{
	public static void main(String args[]){
		Box obj1=new Box(2, 5, 7);
		obj1.volume();
		Box obj2=new Box(3, 4, 2);
		obj2.volume();
		Box obj3=new Box(7, 5, 9);
		obj3.volume();
	}
}
