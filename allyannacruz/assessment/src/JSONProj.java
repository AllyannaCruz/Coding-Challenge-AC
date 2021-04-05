import org.json.JSONObject;
import java.util.Scanner;

public class JSONProj {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);
        JSONObject jsonObject = new JSONObject();

        System.out.println("Please enter keys and values");
        //jsonObject.put("a", 1);
        //jsonObject.put("b",Boolean.valueOf(true));

        JSONObject c = new JSONObject();
        //jsonObject.put("c",c );
        //c.put("d",3);
        //c.put("e", "test");
        /*c.put("c",c);*/
        //System.out.println(jsonObject);
        /*System.out.println(c);*/
        String key1 = jo.nextLine();
        String value1 = jo.nextLine();
        jsonObject.put(key1,value1);

        // String letterD = jsonObject.getJSONObject("c").get("d").toString();
        // String letterE = jsonObject.getJSONObject("c").get("e").toString();
        // String letterC = jsonObject.getJSONObject("c").toString();
        System.out.println(jsonObject);
        
        // System.out.println(jsonObject);
        // System.out.println(letterD);
        // System.out.println(letterE);
        // System.out.println(letterC);

        // c.remove("d");
        // c.remove("e");
        // jsonObject.remove("c");
        // c.put("c.d", 3);
        // c.put("c.e", "test");
        // jsonObject.put("c" + "." + "d", 3);
        // jsonObject.put("c" + "." + "e", "test");
        // System.out.println(jsonObject);

        
    }
}
