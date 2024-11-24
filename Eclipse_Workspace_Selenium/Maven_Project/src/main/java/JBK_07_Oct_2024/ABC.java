package JBK_07_Oct_2024;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ABC {
	public static void main(String[] args)  {
		File f1 = new File("MyConfiguration.properties");
	    InputStream f = new FileInputStream(f1);
		Properties objProperties = new Properties();

		String MyUrl = null;
	}
}
