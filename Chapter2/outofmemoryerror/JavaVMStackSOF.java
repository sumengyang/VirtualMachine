package outofmemoryerror;

public class JavaVMStackSOF {

	private int stackLength = 1;
	public void stackLeak(){
		setStackLength(getStackLength() + 1);
		stackLeak();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try{
			oom.stackLeak();
		}
		catch(Throwable e){
			System.out.println("stack length : " + oom.stackLength);
			throw e;
		}
		
	}

	public int getStackLength() {
		return stackLength;
	}

	public void setStackLength(int stackLength) {
		this.stackLength = stackLength;
	}

}
