class ExceptionTest03 
{
	public static void main(String[] args) 
	{
		int i = m();
		System.out.println(i); // 100
		/*
			java�﷨������һЩ�����ǲ����ƻ��ģ�
			1. �������еĴ������δ��϶���ִ��
			2. return���һ��ִ�У����������������
		*/
	}
	public static int m(){
		int i = 100;
		try{
			return i;
		} finally {
			i++;
		}
	}
			
}
