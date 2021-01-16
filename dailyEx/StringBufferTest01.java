import java.util.Scanner;
public class StringBufferTest01
{
	public static void main(String[] args){
		//String str = "Hello world! I am W.";
		Scanner input = new Scanner(System.in);
		String str = input.next();
		StringBuffer sb = new StringBuffer();
		//int front, last;
		for (int i= 0; i< str.length(); i++ )
		{
			if(str.charAt(i) == ' '){
				sb.append("%20");
			} else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(new String(sb));
	}

}