
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionTest01{
	public static void main(String[] args){
		// ���·�ʽ����ı�����ʽ��������ʽ���������е�Collectionͨ�õ�һ�ַ�ʽ
		Collection c = new ArrayList();
		c.add("abc");
		c.add("def:");
		c.add(100);
		c.add(new Object());

		Iterator it = c.iterator();//�õ���c���ϵĵ�����

		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}

