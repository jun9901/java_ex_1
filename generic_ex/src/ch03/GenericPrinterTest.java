package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// ��� 
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// ����� �� �ڷ����� �־� �ָ� �ȴ�. 
		// ����� : T ��ſ� ����� �� � �ڷ����� ������� ������ �ָ� �ȴ�. 
		//GenericPrinter<Powder> genericPrinter = new GenericPrinter<Powder>();
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		
		// ��� �ֱ� 
		genericPrinter.setMaterial(powder);
		
		// ��� ������ 
		Powder tempPowder = genericPrinter.getMaterial(); 
		System.out.println(tempPowder.toString());
		
		// ���� 1  �ö�ƽ���� ���ظ� Ŭ������ �����ϰ� ��� ���� �� ��Ḧ ���� ���ô�.
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>(); 
		genericPrinter2.setMaterial(plastic);
		
		Plastic plastic2 = genericPrinter2.getMaterial();
		System.out.println(plastic2.toString());

	}

}

