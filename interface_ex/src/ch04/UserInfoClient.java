package ch04;

public class UserInfoClient {
	
	// DBTYPE ����
	// public static String DBTYE = "MYSQL"
	
	public static String DBTYPE = "MSSQL";
	
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("ȫ�浿");
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
		
		// 1. ȸ�� �����̶��
		userInfoDao.insertUserInfo(userInfo);
		// 2. ȸ�� ���� �����̶��
		userInfoDao.updateUserInfo(userInfo);
		// 3 ȸ�� Ż��, ����
		userInfoDao.deleteUserInfo(userInfo);
		
		
		
	}
	
}
