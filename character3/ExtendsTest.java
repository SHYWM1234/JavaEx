public class ExtendsTest{
	public static void main(String[] args){
		CreditCardAccount ca = new CreditCardAccount();
		ca.print();

	}
}

class Account
{
	int id;
	double balance;
	double rate;

}

class CreditCardAccount extends Account
{
	
	int credit;
	public void print(){
		System.out.println(this.id + this.balance + this.rate + this.credit); 
	}
}

//1.�������ã��̳п���ʵ�ִ��븴��
//2.��Ҫ���ã���Ϊ���˼̳й�ϵ�����з������ǺͶ�̬����

//���ࡢ���ࡢ����(superclass)
//���ࡢ�����ࡢ��չ��(subclass)

//javaֻ֧�ֵ��̳�

//����̳и��࣬���˹��췽�����ܼ̳�֮�⣬ʣ�µĶ����Լ̳С�����
//˽�������޷���������ֱ�ӷ���(������private���εĲ�����������ֱ�ӷ���)

//java�е���û����ʾ�̳��κ��࣬Ĭ�ϼ̳�Object�࣬Object����������Ļ���
//�̳е�ȱ�㣺�ô������϶ȸߣ������޸ģ������ܵ�ǣ��

/*editplus��
	��ɫ�����ؼ���
	��ɫ������ʶ��
		��ɫ������ʾ�������SUN��JDKд�õ�һ���ࣨҲ�Ǳ�ʶ����
*/
//C:\Program Files\Java\jdk1.8.0_152\src\java\lang
//�鿴Object���Դ��
//ע�⣺��Դ���е�һ�������ԡ�������β���������η��б�����native�ؼ���
//��ʾ�ײ����C++д��dll����
//


