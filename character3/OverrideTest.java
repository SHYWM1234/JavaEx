public class OverrideTest{
	public static void main(String[] args){
		Bird b = new Bird();
		b.move();
		
	}
}

class Animal
{
	public void move(){
		System.out.println("动物在移动");
	}
}

class Bird extends Animal
{
	//方法重写Override
	public void move(){
		System.out.println("鸟儿在飞翔");
	}

}

//方法覆盖：又叫做方法重写 Override 、 Overwrite
//对比：方法重载Overload

//最好将父类中的方法原封不动的复制过来，（不建议手动重写）

//条件1：两个类必须有继承关系
//条件2：重写之后的方法和之前的方法具有相同的返回值类型、相同的方法名、相同的参数列表
//条件3：访问权限 不能更低、只能更高（privave—> () —>protected—>public）
//条件4：重写之后的方法不能比之前的方法抛出更多的异常。

//注意1：方法覆盖只针对方法，和属性无关
//注意2：私有方法不能覆盖
//注意3：构造方法不能被继承，所以构造方法也不能被覆盖
//注意4：方法覆盖只是针对于“实例方法”，“静态方法”覆盖没有意义。
//静态方法不谈覆盖

//学习了多态机制以后，对于“相同的返回值类型”可以修改吗（实际开发用不到，价值不大）
//返回值为基本数据类型，必须一致。
//重写的时候，返回值类型是引用数据类型，由Animal变成了Cat，变小了，可以
//返回值类型由Animal变成了Object，变大了，不允许
//
