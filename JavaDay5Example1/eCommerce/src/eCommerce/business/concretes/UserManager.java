package eCommerce.business.concretes;

import eCommerce.business.abstracts.RegisterService;
import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
     	private UserDao userdao;
		private RegisterService registerservice;
	public UserManager(UserDao userdao, RegisterService registerservice) {
			super();
			this.userdao = userdao;
			this.registerservice = registerservice;
		}

	@Override
	public void register(User user) {
	
		if(registerservice.Register(user, userdao.getAll())) {
			this.userdao.addUser(user);
			System.out.println(user.getFirstName()+" "+ "Kay�t ger�ekle�ti.");
			
			
		}
		else {
			
			System.out.println("��lem ba�ar�s�z.");
		}
		
		
		
	}

	@Override
	public boolean login(String email, String password) {
		if(this.userdao.get(email, password)!=null) {
			
			System.out.println("Giri� yap�ld�");
			return true;
		}
		else {
			System.out.println("hatal�");
			
			
			
		return false;
		}
		
	}
	

}
