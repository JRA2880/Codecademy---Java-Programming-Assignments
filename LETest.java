import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LETest {
  @Test
  public void withdrawTwoHundred() {
    SavingsAccount savingsTest = new SavingsAccount(2000);
		int returned = savingsTest.withdraw(200);
    int actual = savingsTest.balance;
    int expected = 1800;
    assertEquals("We tested `withdraw(200)` for an account with a balance of 2000, and got the wrong final balance!", expected, actual);
    assertEquals("We tested `withdraw(200)` and got the wrong value returned!", 200, returned);
  }
  
  @Test
  public void withdrawFiveHundred() {
    SavingsAccount savingsTest = new SavingsAccount(500);
		int returned = savingsTest.withdraw(500);
    int actual = savingsTest.balance;
    int expected = 0;
    
    assertEquals("We tested `withdraw(500)` for an account with a balance of 500, and got the wrong final balance!", expected, actual);
    assertEquals("We tested `withdraw(500)` and got the wrong value returned!", 500, returned);
  }
}