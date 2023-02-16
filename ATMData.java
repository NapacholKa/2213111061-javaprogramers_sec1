package file;
import java.io.*;
import java.util.*;

public class ATMData extends ATMBanking{
	private String accountNumber;
	private String password;
	
	public ATMData (String id,String pass) {
		this.accountNumber=pass;
		this.password = pass;
	}
	public String getID(String id) {
		return this.accountNumber;
	}
	public String getPass(String pass) {
		return this.password;
	}

}
