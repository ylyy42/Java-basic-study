import java.io.IOException;
import java.sql.SQLException;

public class Parent2 {
	void parentMethod() throws IOException, SQLException {
		
	}
}
class Child2 extends Parent2 {
	void parentMethod() throws IOException, Exception {
		
	}
}