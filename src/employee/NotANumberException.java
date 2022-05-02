package employee;
import java.util.InputMismatchException;

public class NotANumberException extends InputMismatchException {
	public String getMessage(){
	      return "You did not input a number. Please enter again.";
	   }

}
