package in.arc.beans;

public class UserDAOImpl implements UserDAO {

	public String findName(int id) {
		System.out.println("UserDAOImpl.findName() ");
		return ""+id;
	}
	public UserDAOImpl() {
		System.out.println("UserDAOImpl.UserDAOImpl() :: 0param CONSTRUCTOR");
	}

}
