package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		Order order1 = new Order();
		// 값을 입력하고 출력까지 하라.
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
		// 값을 입력하고 출력까지 하라.
		userinfo1.userId = "ID";
		userinfo1.userPassWord = "PWD";
		userinfo1.userName = "권준혁";
		userinfo1.userAddress = "부산 북구";
		userinfo1.phoneNember = "010-4565-9901";
		
		System.out.println(userinfo1.userId);
		System.out.println(userinfo1.userPassWord);
		System.out.println(userinfo1.userName);
		System.out.println(userinfo1.userAddress);
		System.out.println(userinfo1.phoneNember);
	}

}
