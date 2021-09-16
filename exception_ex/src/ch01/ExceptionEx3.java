package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class MyException{
	String fileName;
	
	public MyException(String fileName) {
		this.fileName = fileName;
		
	}
	
	// throws 란 던지기 ( 사용하는 녀셕이 직접 예외 처리를 해라)
	public String readFile() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Properties properties = new Properties();
		properties.load(fis);
		String dbType = properties.getProperty("DBTYPE");
		return dbType;
	}
}

public class ExceptionEx3 {
	public static void main(String[] args) {
		String dbType = null; 
		// 객체 생성
		MyException exception = new MyException("b.txt");
		try {
			dbType = exception.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("결과값 : " + dbType);
	}
}
