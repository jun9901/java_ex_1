package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter1 dPrinter1 = new ThreeDPrinter1();
		// ��� ���� 
		dPrinter1.setMaterial(powder);
		
		// ��Ḧ ������ Ȯ�� 
		Powder tempPowder =  dPrinter1.getMaterial();
		System.out.println(tempPowder.toString());
		
		System.out.println("-------------------");
		//////// 
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterial(plastic);
		Plastic plastic2 = dPrinter2.getMaterial();
		System.out.println(plastic2.toString());
		
		System.out.println("-------------------");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		// ������ 
		printer3.setMaterial(powder);

		// �ڷḦ �������� 
		Powder tempPowder2 = (Powder)printer3.getMaterial(); 
		System.out.println(tempPowder2.toString());

	}

}


