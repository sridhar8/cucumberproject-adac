package org.config_reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Conf_reader {
	
	public static Properties p;
	public Conf_reader() throws IOException {
			File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
			FileInputStream fis = new FileInputStream(f);
			p = new Properties();
			p.load(fis);
			}
	
	
	public String url() throws IOException {
//		File f=new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p=new Properties();
//		p.load(fis);
		String url=p.getProperty("url");
		return url;
	}
	
	public String username() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String username = p.getProperty("username");
		return username;
	}
	
	public String password() throws IOException {
//	File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//	FileInputStream fis = new FileInputStream(f);
//	p = new Properties();
//	p.load(fis);
	String password = p.getProperty("password");
	return password;
	}
	
	public String location() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String location=p.getProperty("location");
		return location;
	}
	
	public String hotelname() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String hotelname=p.getProperty("hotelname");
		return hotelname;
	}
	public String roomtype() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String roomtype=p.getProperty("roomtype");
		return roomtype;
	}
	public String totalrooms() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String totalrooms=p.getProperty("totalrooms");
		return totalrooms;
	}
	public String adultcount() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String adultcount=p.getProperty("adultcount");
		return adultcount;
	}
	public String childcount() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String childcount=p.getProperty("childcount");
		return childcount;
	}
	public String firstname() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String firstname=p.getProperty("firstname");
		return firstname;
	}
	public String lastname() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String lastname=p.getProperty("lastname");
		return lastname;
	}
	public String address() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String address=p.getProperty("address");
		return address;
	}
	public String ccnumber() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String ccnumber=p.getProperty("ccnumber");
		return ccnumber;
	}
	public String cctype() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String cctype=p.getProperty("cctype");
		return cctype;
	}
	public String ccexpiremonth() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String ccexpiremonth=p.getProperty("ccexpiremonth");
		return ccexpiremonth;
	}
	public String ccexpireyear() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String ccexpireyear=p.getProperty("ccexpireyear");
		return ccexpireyear;
	}
	public String cvvnumber() throws IOException {
//		File f = new File("C:\\Users\\sri\\eclipse-workspace\\aaadactin\\src\\main\\java\\turistdetails\\properties\\checkindetails.properties");
//		FileInputStream fis = new FileInputStream(f);
//		p = new Properties();
//		p.load(fis);
		String cvvnumber=p.getProperty("cvvnumber");
		return cvvnumber;
	}
	
	
	
	

}
