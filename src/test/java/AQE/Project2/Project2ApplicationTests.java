package AQE.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project2ApplicationTests {

	public static String browser="edge";
	public static WebDriver dr;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			if(browser.equals("firefox")) {
				dr=new FirefoxDriver();
			}else if(browser.equals("edge")) {
				dr=new EdgeDriver();
			}
			dr.get("http://localhost:8080");
			dr.findElement(By.id("j_username")).sendKeys("admin");
			dr.findElement(By.name("j_password")).sendKeys("a4b25f856059493cac2d3a12fc555da2");
			dr.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();

		}


}
