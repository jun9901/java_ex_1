package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest3 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts/100");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-tpye", "application/json");
			connection.connect();

			int statusCode = connection.getResponseCode();

			System.out.println("statusCode :" + statusCode);

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("서버에 연결을 할 수 없습니다.");
			}
			String str = sb.toString();
			Gson gson = new Gson();
			Post post = gson.fromJson(str, Post.class);
			
			System.out.println("ID :" + post.id);
			System.out.println("Title :" + post.title);
			System.out.println("userID :" + post.userId);
			System.out.println("Body :" + post.body);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
