package ch04;

class water {
	@Override
	public String toString() {
		return "재료는 물입니다";
	}
}



public class TExtendsclass {
	public static void main(String[] args) {
		// <T extends 클래스> 사용하기 
		// T 자료형의 범위를 제한 할 수 있음(제한하지 않으면 자료형으로 아무 클래스나 올 수 있다) 
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); 
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder.toString());
		System.out.println("------------------");
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>(); 
	}
}