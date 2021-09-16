package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// 재료 
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용할 때 자료형을 넣어 주면 된다. 
		// 사용방법 : T 대신에 사용할 때 어떤 자료형을 사용할지 지정해 주면 된다. 
		//GenericPrinter<Powder> genericPrinter = new GenericPrinter<Powder>();
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		
		// 재료 넣기 
		genericPrinter.setMaterial(powder);
		
		// 재료 꺼내기 
		Powder tempPowder = genericPrinter.getMaterial(); 
		System.out.println(tempPowder.toString());
		
		// 문제 1  플라스틱으로 제넥릭 클래스를 선언하고 재료 셋팅 후 재료를 꺼내 봅시다.
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>(); 
		genericPrinter2.setMaterial(plastic);
		
		Plastic plastic2 = genericPrinter2.getMaterial();
		System.out.println(plastic2.toString());

	}

}

