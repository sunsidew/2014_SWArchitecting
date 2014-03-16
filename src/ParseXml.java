import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class ParseXml {

   @Element
   private String Method;
   
   public ParseXml() {
	   super();
   }
   
   public ParseXml(String Method) {
	   this.Method = Method;
   }
   
   public String getMethod() {
      return Method;
   }
}