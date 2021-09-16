package ch04;

public class UserInfoClient {
	
	// DBTYPE 설정
	// public static String DBTYE = "MYSQL"
	
	public static String DBTYPE = "MSSQL";
	
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("홍길동");
		userInfo.setUserId("myUSerID");
		userInfo.setPassword("12345!@#");
		
		UserInfoDao userInfoDao = null;
		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if(DBTYPE.equals("ORACLE")){
			userInfoDao = new UserInfoOracleDao();
		} else {
			userInfoDao = new UserInfoMsSqlDao();
		}
		
		// 1. 회원 가입이라면
		userInfoDao.insertUserInfo(userInfo);
		// 2. 회원 정보 수정이라면
		userInfoDao.updateUserInfo(userInfo);
		// 3 회원 탈퇴, 삭제
		userInfoDao.deleteUserInfo(userInfo);
		
		
		
	}
	
}
