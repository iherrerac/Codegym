package codegym;

/* 
In the blue depths of the stack trace…

*/

public class PilasThreadCuanProfundo {

	    public static void main(String[] args) throws Exception {
	        int deep = getStackTraceDepth();
	        
	    }

	    public static int getStackTraceDepth() {
	        int deep = Thread.currentThread().getStackTrace().length;
	        System.out.println(deep);
	        return deep;
	    }
	}
