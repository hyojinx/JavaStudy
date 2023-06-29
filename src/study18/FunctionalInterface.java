package study18;

//@FunctionalInterface
public interface FunctionalInterface {
	void abMethod();//함수형 인터페이스는 메소드가 하나만
	
}
interface FunctionalInterface1{//input  X output  X
	void abMethod1();
	
}
interface FunctionalInterface2{//input  X output  O
	int abMethod2();
	
}
interface FunctionalInterface3{//input  O output  X
	void abMethod3(int i);
}
interface FunctionalInterface4{//input  O output  O
	double abMethod4(int i,double d);
}