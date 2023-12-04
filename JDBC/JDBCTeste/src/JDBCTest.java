import model.ModelException;
import model.User;
import model.dao.MySQLUserDAO;
import model.dao.UserDAO;


	public class JDBCTest {
	public static void main(String[] args) throws ModelException {
		
	UserDAO userDAO = new MySQLUserDAO();
		
		for (User user: userDAO.listAll()) {
			System.out.println(user.getName()+ " - " +user.getEmail());
		}
		//emerson.setName("Emerson Teste DAO");
		//emerson.setGender("M");
		//emerson.setEmail("emerson@gmail.com");
		
		//UserDAO userDAO = new MySQLUserDAO();
		//userDAO.save(emerson); adiconando e salvando no banco

}
	
	}