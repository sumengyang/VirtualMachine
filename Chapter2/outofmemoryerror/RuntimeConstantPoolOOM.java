package outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		//10MB��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while(true){
			System.out.println(i);
			list.add(String.valueOf(i++).intern());
		}
	}

}
