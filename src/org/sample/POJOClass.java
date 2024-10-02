package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class POJOClass {

	private String userName;
	private String password;
	private int balance;
	public static Map<String, Integer> m = new LinkedHashMap();

	public void setUserName(String s) {
		if (s.equals("devi@123")) {
			this.userName = "username of devi is validated";
		} else if (s.equals("agil@123")) {
			this.userName = "username of agil is validated";
		} else if (s.equals("sanji@123")) {
			this.userName = "username of sanji is validated";
		} else {
			this.userName = "username not validated";
		}

	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String s) {
		if (s.equals("devi@111") && userName.contains("devi")) {
			this.password = "password of devi is validated";
		} else if (s.equals("agil@111") && userName.contains("agil")) {
			this.password = "password of agil is validated";
		} else if (s.equals("sanji@111") && userName.contains("sanji")) {
			this.password = "password of sanji is validated";
		} else {
			this.password = "password not validated";
		}

	}

	public String getPassword() {
		return password;
	}

	public void setBalance(int a) {
		if (a == 1 && password.contains("devi")) {
			this.balance = m.get("devi@123");
		} else if (a == 2 && this.password.contains("agil")) {
			this.balance = m.get("agil@123");
		} else if (a == 3 && this.password.contains("sanji")) {
			this.balance = m.get("sanji@123");
		} else {
			this.balance = 0;
		}

	}

	public int getBalance() {
		return balance;
	}

	public void readDataFromTextFile() throws IOException {
		File f = new File("DataBase\\datafile.txt");
		List<String> readLines = FileUtils.readLines(f);

		for (int i = 0; i < readLines.size(); i++) {
			String string = readLines.get(i);
			String[] split = string.split(",");
			String userName = split[0];
			String balance = split[2];
			int balance1 = Integer.parseInt(balance);

			m.put(userName, balance1);

		}
		// System.out.println(m);
	}

}
