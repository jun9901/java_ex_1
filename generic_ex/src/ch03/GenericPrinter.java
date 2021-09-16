package ch03;

public class GenericPrinter<T> {

	// T ��� ��ü ���ڸ� ���, E - element, , K - key, V - value (��� �ƹ� ���ڳ� ��� ����) 
	// �ڷ��� �Ű�����( type parameter) 
	// �� Ŭ������ ����ϴ� �������� ���� ����� �ڷ����� ������ �մϴ�. 
	
	private T material;  //  T �ڷ������� ������ ���� 
	
	public T getMaterial() {   // T �ڷ����� ��ȯ�ϴ� ���׸� �޼��� 
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material; 
	} 
	
	// toString �������̵� 
	@Override
	public String toString() {
		return material.toString();
	}
}
