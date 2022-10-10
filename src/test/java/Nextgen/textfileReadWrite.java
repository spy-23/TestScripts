package Nextgen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig.Property;

public class textfileReadWrite {
	private WebDriver driver;
	Browser browser = new Browser(driver);
	NxtGenForm form = new NxtGenForm(driver);
	
//@Test
/*public void WriteOnFile() throws IOException {
	File file = new File("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\nextgenData.txt");
	FileWriter add = new FileWriter(file);
	BufferedWriter writee = new BufferedWriter(add);
	writee.write("My name is");
	writee.newLine();
	writee.write("Hello");
	writee.close();

}*/

//@Test
/*public void ReadFile() throws IOException {
	File file = new File("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\nextgenData.txt");
	FileReader eee = new FileReader(file);
	BufferedReader readd = new BufferedReader(eee);
	String str = null;
	while((str= readd.readLine())!=null) {
		System.out.println(str);
	}
}*/
	//@Test
	/*public void propertyReader() throws IOException {
		Properties pro = new Properties();
		FileInputStream loc = new FileInputStream("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties");
		pro.load(loc);
		String value = pro.getProperty("browser");
		System.out.println(value);
	
	}*/
@Test
public void launchbrowser() throws Exception {
	String keystr1 = null;
	keystr1 = browser.propertyReader("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties", "browser");
	browser.setupbrowser(keystr1);
	String keystr2 = null;
	keystr2 = browser.propertyReader("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties", "url");
	browser.setupsite(keystr2);
	Thread.sleep(5000);
	
}
@Test
public void Signup() throws IOException {
	String keystr3 = null;
	keystr3 = browser.propertyReader("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties", "username");
	form.setFirstname(keystr3);
	String keystr4 = null;
	keystr4 = browser.propertyReader("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties", "lastname");
	form.setLastname(keystr4);
	String keystr5 = null;
	keystr5 = browser.propertyReader("C:\\Users\\parth\\eclipse-workspace\\parth\\src\\test\\resources\\config.properties", "gender");
	form.setGender(keystr5);

}

}
