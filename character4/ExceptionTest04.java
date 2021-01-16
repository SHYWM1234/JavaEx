public class ExceptionTest04
{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 0;
		/*
		if(i2 ==0){
			System.out.println("i2 ==0");
		}else{
			System.out.println(i1/ i2);
		}
		System.out.println("Program terminated");
		*/

		try{
			System.out.println(i1 / i2);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Program terninated");
		}



	}
}