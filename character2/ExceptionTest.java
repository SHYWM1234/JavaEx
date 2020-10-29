

public class ExceptionTest{
	public static void main(String[] args){
		int x  = 0, y = 0, z= 100;
		try{
			y = Integer.parseInt("444");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}catch(NumberFormatException e){
			System.out.println("Exception!");
		}
	}
}