package study21;

class Result{
	int result = 100;
	public void calResult() {
		int temp=result;
		System.out.println(temp);
		try {Thread.sleep(2500);}catch(InterruptedException e) {};
		result = result/2;
		System.out.println(result);
	}
}

class calThread extends Thread{
	Result resultObj;
	public calThread(Result resultObj) {
		this.resultObj=resultObj;
	}
	@Override
	public void run() {
		resultObj.calResult();
		System.out.println(getName()+" "+resultObj.result);
	}
}

public class NonSyncThreadRun {
	public static void main(String[] args) {
		Result resultobj = new Result();		//공유객체
		Thread cal1 = new calThread(resultobj);
		cal1.setName("no.1 thread");
		cal1.start();
		try {Thread.sleep(1000);}catch(InterruptedException e) {};
		Thread cal2 = new calThread(resultobj);
		cal2.setName("np.2 thread");
		cal2.start();
	}
}
