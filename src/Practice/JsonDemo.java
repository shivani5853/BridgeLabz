package Practice;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) throws IOException {
		JSONObject obj=new JSONObject();
		obj.put("name", "shivani");
		obj.put("num", new Integer(12));
		obj.put("value", new Double(12.0));
		obj.put("abool", new Boolean(true));
		System.out.println(obj);
		
		StringWriter out=new StringWriter();
		obj.writeJSONString(out);
		String jsonText=out.toString();
		System.out.println(jsonText);
		
	}
}

