package eCommerce.core.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.UserCheckService;
import eCommerce.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	private static final Pattern validMailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	@Override
	public boolean checkPassword(String password) {
		if(password.length()>6) {return true;}
		System.out.println("Parola 6 karakter �zeri olmal�d�r");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkEmailAddress(String email, List<User> userList) {
        Matcher matcher = validMailRegex.matcher(email);
		
		if(matcher.find()) {
			for(User user : userList) {
				if(user.getEmail() == email){
					System.out.println("Girdi�iniz email adresi zaten sistemde mevcut.");
					return false;
				}
			}
			return true;
		}
		System.out.println("Ge�erli bir email adresi giriniz.");
        return false;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length() >= 2) {
			return true;
		}
		System.out.println("ad�n�z 2 karakter olmal�d�r.");
		return false;
		
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length() >= 2) {
			return true;
		}
		System.out.println("soyad�n�z 2 karakter olmal�d�r");
		return false;
	}
	//Regex
	
	
	

}
