public class ExtendsTest{
	public static void main(String[] args){
		
	}
}

class Account
{
	double 
}

class CreditAccount extends Account
{

}

//1.基本作用：继承可以实现代码复用
//2.主要作用：因为有了继承关系，才有方法覆盖和多态机制

//父类、基类、超类(superclass)
//子类、派生类、拓展类(subclass)

//java只支持单继承

//子类继承父类，除了构造方法不能继承之外，剩下的都可以继承。但是
//私有属性无法在子类中直接访问(父类中private修饰的不能在子类中直接访问)

//java中的类没有显示继承任何类，默认继承Object类，Object类是所有类的基类
//继承的缺点：让代码的耦合度高，父类修改，子类受到牵连

/*editplus中
	蓝色——关键字
	黑色——标识符
		红色——表示这个类是SUN的JDK写好的一个类（也是标识符）
*/
//C:\Program Files\Java\jdk1.8.0_152\src\java\lang
//查看Object类的源码
//注意：党员马中第一个方法以“；”结尾，并且修饰符列表中有native关键字
//表示底层调用C++写的dll程序
//


