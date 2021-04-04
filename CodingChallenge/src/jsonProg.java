import org.json.JSONObject;

public class jsonProg {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a", 1);
        jsonObject.put("b",Boolean.valueOf(true));
        JSONObject c = new JSONObject();
        c.put("d",3);
        c.put("e", "test");
        //c.put("c",c);
        System.out.println(jsonObject);
        System.out.println(c);
    }
}
