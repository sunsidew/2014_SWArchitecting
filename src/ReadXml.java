import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class ReadXml {
	public static String className() {
		Serializer serializer = new Persister();
		File source = new File("SortMethod.xml");
		ParseXml sorting = null;
		
		try {
			sorting = serializer.read(ParseXml.class, source);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sorting.getMethod();
	}
}
