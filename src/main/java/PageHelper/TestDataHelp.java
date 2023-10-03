package PageHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class TestDataHelp {
	public Properties prop;

	public TestDataHelp() throws Exception {
		FileInputStream f = new FileInputStream(System.getProperty("user.dir") + File.separator + "objectRepositories"
				+ File.separator + "data.properties");
		prop = new Properties();
		prop.load(f);
	}

	public String getValue(String s) {
		return prop.getProperty(s);

	}
}
