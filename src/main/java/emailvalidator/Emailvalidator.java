package emailvalidator;
public class Emailvalidator {
  private static Emailvalidator result;
  public static Emailvalidator getInstance(){
    if (result == null) {
    	result = new Emailvalidator();
    }
    return result;
  }
  public boolean isValid(String email) {
    int x = 0, y = 0;
    for (char ch : email.toCharArray()) {
    	if(ch=='.'){
    		x++;
    	}
    	else if(ch=='@'){
    		y++;
      }
    }
    if (y == 1 && x >= 1) {
      return true;
    }
    else {
      return false;
    }
  }
}
