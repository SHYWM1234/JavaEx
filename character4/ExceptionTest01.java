public class ExceptionTest01{
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		String filedir = ".\test.txt";
		NumberFormatException nfe = new NumberFormatException("���ָ�ʽ���쳣");

		System.out.println(nfe);

		NullPointerException npe = new NullPointerException("��ָ���쳣");

		System.out.println(npe);

		String info = npe.getMessage();

		System.out.println(info);

		npe.printStackTrace();

		

		}

}