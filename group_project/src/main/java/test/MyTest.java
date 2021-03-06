package test;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Student;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MyTest {

	//test method identifier
    @Test
    public void test1() throws IOException {

        try{
	        URL url = new URL(TestConfig.URL+"students");
	        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
	        String line = "";
	        StringBuilder stringBuilder = new StringBuilder();
	
	        while((line = bufferedReader.readLine()) !=null){
	            stringBuilder.append(line);
	        }
	
	        Gson gson = new Gson();
	        String json = stringBuilder.toString();
	        List<Student> students = gson.fromJson(json, new TypeToken<List<Student>>(){}.getType());
	        //String s = stringBuilder.toString();
			//Matches the value of student 0 to Thanh
	        Assert.assertEquals(students.get(0).getName(), "testname");
	        
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
    }
}
	//test method identifier
	@Test
	public void test2() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"students");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Student> students = gson.fromJson(json, new TypeToken<List<Student>>(){}.getType());
			//String s = stringBuilder.toString();
			//Matches the value of student 0 to Thanh
			Assert.assertEquals(students.get(0).getAddress(), "testaddress");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//test method identifier
	@Test
	public void test3() throws IOException {

		try{
			URL url = new URL(TestConfig.URL+"students");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line = "";
			StringBuilder stringBuilder = new StringBuilder();

			while((line = bufferedReader.readLine()) !=null){
				stringBuilder.append(line);
			}

			Gson gson = new Gson();
			String json = stringBuilder.toString();
			List<Student> students = gson.fromJson(json, new TypeToken<List<Student>>(){}.getType());
			//String s = stringBuilder.toString();
			//Matches the value of student 0 to Thanh
			Assert.assertEquals(students.get(0).getContact(), "testcontact");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
