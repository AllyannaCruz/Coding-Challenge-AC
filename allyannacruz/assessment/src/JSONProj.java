import org.json.JSONObject;

public class JSONProj {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a", 1);
        jsonObject.put("b",Boolean.valueOf(true));
        //jsonObject.put("c", );
        JSONObject c = new JSONObject();
        jsonObject.put("c",c );
        c.put("d",3);
        c.put("e", "test");
        //c.put("c",c);
        System.out.println(jsonObject);
        //System.out.println(c);
    }
}
