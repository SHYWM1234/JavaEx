
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionTest01{
	public static void main(String[] args){
		// 以下方式讲解的遍历方式（迭代方式），是所有的Collection通用的一种方式
		Collection c = new ArrayList();
		c.add("abc");
		c.add("def:");
		c.add(100);
		c.add(new Object());

		Iterator it = c.iterator();//拿到了c集合的迭代器

		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

