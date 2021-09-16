package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest5 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/Comments/100");
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
			Users users = gson.fromJson(str, Users.class);
			users.company = gson.fromJson(str, Company.class);
//			Address address = gson.fromJson(str, Address.class);
//			Company company = gson.fromJson(str, Company.class);
//			Geo geo = gson.fromJson(str, Geo.class);
			
			 
			System.out.println("id :" + users.id);
			System.out.println("name :" + users.name);
			System.out.println("userName :" + users.userName);
			System.out.println("email :" + users.email);
			System.out.println("address :");
			System.out.println("\t street :" + users.address.street);
			System.out.println("\t suite :" + users.address.suite);
			System.out.println("\t city :" + users.address.city);
			System.out.println("\t zipcode :" + users.address.zipcode);
			System.out.println("\t geo :");
			System.out.println("\t\t lat :" + users.geo.lat);
			System.out.println("\t\t lng :" + users.geo.lng);
			System.out.println("phone :" + users.phone);
			System.out.println("website :" + users.website);
			System.out.println("company :");
			System.out.println("\t name :" + users.company.name);
			System.out.println("\t catchPhrase :" + users.company.catchPhrase);
			System.out.println("\t bs :" + users.company.bs);
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
