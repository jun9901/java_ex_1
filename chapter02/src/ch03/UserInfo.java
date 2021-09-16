package ch03;

public class UserInfo {
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	int usercode;
	// 생성자 오버로딩
	// 문제 1. 기본 생성자
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	// 문제 2. userId 값을 받는 생성자 만들기
	
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 문제 3. userId, userPassWord
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	// 문제 4. userId, userPassWord, userName
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	// 문제 5. userId, userPassWord, userName, userAddress
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	// 문제 6. userId, userPassword, userName, userAddress, phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	// 문제 7. int 형식 데이터 만들어서 생성자까지 만들기.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber, int usecode) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		this.usercode = usecode;
	}
	
}
