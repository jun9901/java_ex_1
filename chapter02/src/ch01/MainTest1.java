package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		Order order1 = new Order();
		// ���� �Է��ϰ� ��±��� �϶�.
		order1.orderId = 1;
		order1.buyerId = "Kwon";
		order1.sellerId = "Chicken";
		order1.productId = 0001;
		order1.orderDate = "2021-08-23";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		
			
		System.out.println();
				
		
		UserInfo userinfo1 = new UserInfo();
		// ���� �Է��ϰ� ��±��� �϶�.
		userinfo1.userId = "ID";
		userinfo1.userPassWord = "PWD";
		userinfo1.userName = "������";
		userinfo1.userAddress = "�λ� �ϱ�";
		userinfo1.phoneNember = "010-4565-9901";
		
		System.out.println(userinfo1.userId);
		System.out.println(userinfo1.userPassWord);
		System.out.println(userinfo1.userName);
		System.out.println(userinfo1.userAddress);
		System.out.println(userinfo1.phoneNember);
	}

}
