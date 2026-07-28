public class Factorial{
	public void Numbers(int a){
		int i,result = 1;
		for( i = 2;i <= a; i++){
			result *= i;
		}
		System.out.println(result);
	}
	public static void main(String[] args){
		Factorial n1 = new Factorial();
		n1.Numbers(6);
	}
}