package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 
{
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed");
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed");
  }
  
  
  @Test
  public void tc003() 
  {
	  Reporter.log("tc003 executed");
  }
}
