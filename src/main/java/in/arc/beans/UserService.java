package in.arc.beans;

public class UserService {

	private UserDAO userDAO;
	
	public UserService() {
		System.out.println("UserService.UserService() :: 0param Constructor");
	}
	public UserService(UserDAO dao) {
		System.out.println("UserService.UserService() :: 0param Constructor");
		this.userDAO=dao;
	}
	
	public void printName(int id) {
		String findName = userDAO.findName(13);
		if(findName.equalsIgnoreCase("13")) {
			System.out.println("UserService.printName() name found for id "+id);
		}else {
			System.out.println("UserService.printName() userNmae NotFound");
		}
	}
	
}
