package selenideBootstrap.examples;

import org.junit.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

public class ExampleTests {
	
  @Test
  public void someActions() {
    open("http://mirabeautest.azurewebsites.net/Inputs");
    $(By.cssSelector("#text-control")).setValue("hoihoi");
    $(By.cssSelector("#input-button-control")).click();
    $(By.cssSelector("#multi-select-control")).selectOptionByValue("MB");  
  }
  
  @Test
  public void someAssertions() { 
	  open("http://mirabeautest.azurewebsites.net/Inputs");
	  boolean exists = $(By.cssSelector("#text-control")).exists();
	  assertTrue(exists);

	  boolean visble = $(By.cssSelector("#text-control")).exists();
	  assertTrue(visble);
	  
	  String text = $(By.cssSelector("#text-control")).getText();	  
	  assertEquals("hoi", text);
  }
  
  
  
}
