/*
    Author: Allyanna Cruz
    Program Description: A program which takes in a JSON object as input and out puts a flattened version of the input.
    The libraries used are specified in the README file. The user is prompted to choose between method 1 or 2.
    I added two methods because method 2, JSONParse, parses the file specified into a JSON object, whereas method 1, 
    JSONInput allows the user to input the key value pairs in, based on the test1.json file
*/

package allyannacruz.assessment.src;

import org.json.JSONObject;

import org.apache.commons.io.IOUtils;

import java.util.Scanner;
import java.io.InputStream;
import java.io.FileWriter;

public class JSONProj {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nPress 1 to input JSON object \n or \nPress 2 to parse test1.txt\n");
        char inOrp = sc.next().charAt(0);

        // Switch statement to allow user to choose which method to use
        switch(inOrp) {
            case '1':
                JSONProj.JSONInput(); // Method which takes in user input to output a flattened JSON object
                break;
            case '2':
                JSONProj.JSONParse(); // Method which parses a .txt file in a JSON format and outputs the flattened JSON object
                break;
            default:
                System.out.println("Please enter 1 or 2. Run program again");
        } // end switch
        
        
        sc.close();
    } // end main()

    // This method takes in user input, based on the test1.txt or test1.json file.
    // The json object is then printed and saved into whatever directory is specified in the path.
    public static void JSONInput() throws Exception {
        Scanner jo = new Scanner(System.in);
        JSONObject jsonObject = new JSONObject();

        System.out.println("Please enter keys and values\n");

        System.out.println("Key 1:" );
        String key1 = jo.nextLine();
        System.out.println("Value 1:" );
        String value1 = jo.nextLine();
        jsonObject.put(key1,value1);
        System.out.println("Key 2: ");
        String key2 = jo.nextLine();
        System.out.println("Value 2: ");
        String value2 = jo.nextLine();
        jsonObject.put(key2,value2);
        System.out.println("Key 3: ");
        String key3 = jo.nextLine();
        System.out.println("Value 3: ");
        String value3 = jo.nextLine();

        
        System.out.println("Key 4: ");
        String key4 = jo.nextLine();
        System.out.println("Value 4: ");
        String value4 = jo.nextLine();
        jsonObject.put(key3 + "." + key4,value4);
        System.out.println("Key 5: ");
        String key5 = jo.nextLine();
        System.out.println("Value 5: ");
        String value5 = jo.nextLine();
        jsonObject.put(key3 + "." + key5,value5);

        System.out.println(jsonObject);
        
        jo.close();
        
        String jsonFStr = jsonObject.toString();

        // Please replace the path to your own path.
        // The .json file will be saved as output1.json
        try {
            FileWriter fw = new FileWriter("C:/Users/acruz/OneDrive - Technological University Dublin/Documents/School/Year 3/Year 3 Semester 2/MongoDB Coding Challenge/allyannacruz/assessment/src/output1.json");
            fw.write(jsonFStr);
            fw.close();
            System.out.println("\nFile saved in your folder");
        } catch (Exception e) {
            System.out.println("Cannot write file" + e.toString());
        } 
    } // end JSONInput()


    // This method parses the test1.txt which contains the json test format.
    // The method converts the .txt file into a String and into a JSON object.
    // The method removes the key "c" and replaces it with the keys "c.d" and "c.e"
    // The jsonF JSON object is then converted into a string so that it can be wriiten into a new .json file
    // Please change the path according to your own path
    // The .json file is saved as output2.json
    public static void JSONParse() throws Exception {
        InputStream is = JSONProj.class.getResourceAsStream("test1.txt");
        String testTxt  = IOUtils.toString(is, "UTF-8");
        System.out.println("\n" + testTxt + "\n");
        System.out.println("Flattened version: \n");

        JSONObject jsonF = new JSONObject(testTxt);

        String letterD = jsonF.getJSONObject("c").get("d").toString();
        String letterE = jsonF.getJSONObject("c").get("e").toString();
        jsonF.remove("c");
        jsonF.put("c" + "." + "d", letterD);
        jsonF.put("c" + "." + "e", letterE);
        System.out.println(jsonF);
        String jsonFStr = jsonF.toString();

         // Please replace the path to your own path.
        // The .json file will be saved as output2.json
        try {
            FileWriter fw = new FileWriter("C:/Users/acruz/OneDrive - Technological University Dublin/Documents/School/Year 3/Year 3 Semester 2/MongoDB Coding Challenge/allyannacruz/assessment/src/output2.json");
            fw.write(jsonFStr);
            fw.close();
            System.out.println("\nFile saved in your folder");
        } catch (Exception e) {
            System.out.println("Cannot write file" + e.toString());
        } 
        

    } // end JSONParse()
} // end JSONProj class