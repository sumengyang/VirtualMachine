package outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用List保持着常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		//10MB的PermSize的integer范围内足够产生OOM了
		int i = 0;
		while(true){
			System.out.println(i);
			list.add(String.valueOf(i++).intern());
		}
	}

}
