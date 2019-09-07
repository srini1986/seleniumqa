import java.util.Properties;

public class PropertiesFileReader {

	public Properties getProperty() throws IOException
	{
		
		FileInputStream inputStream = null;
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("C:\\Users\\sdhar\\Downloads\\942019\\NewCode\\UIProperties.Properties"));
			}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
		return properties;
		
	}
	
	
	
}
