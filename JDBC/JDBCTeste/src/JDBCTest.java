import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JDBCTest {
	//		// Nome do Driver (classe) e URL do banco
	//		// API JDBC < 3 e Java < 5
	//		private static final String JDBC_DRIVER_NAME = "com.mysql.jdbc.Driver";

	// Novo driver JDBC
	// API JDBC >= 3 e Java >= 5
	private static final String JDBC_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1/facebook"; // local do servidor

	// Credenciais
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			// Necessário se API JDBC < 3 e Java < 5
			Class.forName(JDBC_DRIVER_NAME);

			connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

			statement = connection.createStatement();

			String sqlQuery;

			sqlQuery =  "SELECT u.nome, p.content, p.post_date "
					+ "FROM users u "
					+ "INNER JOIN posts p "
					+ "ON u.id = p.user_id ";

			ResultSet rs = statement.executeQuery(sqlQuery);

			while (rs.next()) {
				String userName = rs.getString("nome");
				String postContent = rs.getString("content");
				Date postDate = rs.getDate("post_date");

				System.out.printf("'%s' postou '%s' em '%tA, %<te de %<tB de %<tY' %n", 
						userName, postContent, postDate);
			}

			rs.close();
			statement.close();
			connection.close();
		} catch (SQLException sqlError) {
			// Erro na execução da SQL
			sqlError.printStackTrace();
		} catch (Exception generalError) {
			// Errors na carga do drive (Class.forName)
			generalError.printStackTrace();
		} finally {
			// Para fechar os recursos em caso de erros
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException sSqlError) {
				sSqlError.printStackTrace();
			}

			try {
				if (connection != null)
					connection.close();
			} catch (SQLException cSqlError) {
				cSqlError.printStackTrace();
			} 
		}
	}
}
