package locatorsAndMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFile {
	public Properties propertyReader(String path) throws IOException {
		Properties property = new Properties();
		FileInputStream yes = new FileInputStream(path);
		property.load(yes);
		//String value = property.getProperty(key);
		return property;
	}
}
