class ExceptionTest03 
{
	public static void main(String[] args) 
	{
		int i = m();
		System.out.println(i); // 100
		/*
			java语法规则（有一些规则是不能破坏的）
			1. 方法体中的代码依次从上而下执行
			2. return语句一旦执行，整个方法必须结束
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
