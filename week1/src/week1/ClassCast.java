package week1;

class SuperCls{
	int a;
	void print() {
		System.out.println("I'm super class");
	}
}
class subCls extends SuperCls{
	int b;
	void printsub() {
		System.out.println("I'm sub class");
	}
}

public class ClassCast {
	//최상위 클래스 모든걸 받아주는 클래스
	public static void Opp(Object ooo) {
		SuperCls sup = (SuperCls)ooo;
		subCls sub = (subCls)ooo;
	}
	public static void main(String[] args) {
		SuperCls sup = new SuperCls();
		subCls sub = new subCls();
		SuperCls sus = new subCls();
		subCls ssub = (subCls)sus;
		Object obj1 = new Object();
		Object obj2 = new SuperCls();
		Opp(obj1); Opp(sup); Opp(sub);
	}
}
