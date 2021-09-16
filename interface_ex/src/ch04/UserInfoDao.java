package ch04;

// �ְ� ���� �����ڰ� �������̽��� �����ؼ� Ŭ���̾�Ʈ �� �ڵ��� �ñ�.
// ����, Ȥ�� �������� DB�� ���� �ڵ��� �ñ�.
// �������̽� (�Ծ�, ���)�� ����� ���� �ʴ´ٸ� ���� �����ڰ� �۾��� ���������� ��ٷ����Ѵ�.
// �� ���� �ð� ���� --> ���� ��� ����
public interface UserInfoDao {
	
	// Ŭ���̾�Ʈ �����ڴ� �Ű������� UserInfo��ü�� �Ѱ��ָ� �ȴ�.
	// DB �����ڵ� UserInfo ��ü�� �Ѱ� �޾Ƽ� �ڵ��� ���ش�.
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
