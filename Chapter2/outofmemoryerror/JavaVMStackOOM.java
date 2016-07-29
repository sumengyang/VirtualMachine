package outofmemoryerror;

public class JavaVMStackOOM {
	private void dontStop(){
		while(true){
			
		}
	}
	
	public void stackLeakByThread(){
		while(true){
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run(){
					dontStop();
				}
			});
			thread.start();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}

}
