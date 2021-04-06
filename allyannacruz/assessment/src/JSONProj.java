/*
    Author: Allyanna Cruz
    Program Description: A program which takes in a JSON object as input and out puts a flattened version of the input.
*/

package allyannacruz.assessment.src;

import org.json.JSONObject;

import org.apache.commons.io.IOUtils;

import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONProj {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nPress 1 to input JSON object \n or \nPress 2 to parse test1.txt");
        char inOrp = sc.next().charAt(0);

        // if(inOrp == '1') {
        //     JSONProj.JSONInput(); // Method which takes in user input to output a flattened JSON object
        // }
        // else if(inOrp == '2') {
        //     JSONProj.JSONParse(); // Method which parses a .txt file in a JSON format and outputs the flattened JSON object
        // }
        // else {
        //     System.out.println("Please input only either 1 or 2\n");
        //     inOrp = sc.next().charAt(0);

        //     if(inOrp == '1') {
        //         JSONProj.JSONInput(); // Method which takes in user input to output a flattened JSON object
        //     }
            
        //     if(inOrp == '2') {
        //         JSONProj.JSONParse(); // Method which parses a .txt file in a JSON format and outputs the flattened JSON object
        //     }
        // } // end if else

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

    public static void JSONInput() throws Exception {
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
        //jsonObject.put(key3,value3);
        if(value3 == "none") {
            System.out.println("Enter key and value"); 
            
        } // end if
        
        System.out.println("Key 4: ");
        String key4 = jo.nextLine();
        System.out.println("Value 4: ");
        String value4 = jo.nextLine();
        jsonObject.put(key3 + "." + key4,value4);
        // if(key3 == "d") jsonObject.put(key3 + "." + value3)
        System.out.println("Key 5: ");
        String key5 = jo.nextLine();
        System.out.println("Value 5: ");
        String value5 = jo.nextLine();
        jsonObject.put(key3 + "." + key5,value5);

        //(key(i) || value(i) == "STOP")
        //break; - stops the loop.

        // String letterD = jsonObject.getJSONObject("c").get("d").toString();
        // String letterE = jsonObject.getJSONObject("c").get("e").toString();
        // String letterC = jsonObject.getJSONObject("c").toString();
        System.out.println(jsonObject);
        jo.close();
        
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

        //object c
        //JSONProj jp = new JSONProj();
    } // end JSONInput()


    public static void JSONParse() throws Exception {
        InputStream is = JSONProj.class.getResourceAsStream("test1.txt");
        String testTxt  = IOUtils.toString(is, "UTF-8");
        System.out.println("\n" + testTxt + "\n");
        System.out.println("Flattened version: \n");

        JSONObject jsonF = new JSONObject(testTxt);

        String letterD = jsonF.getJSONObject("c").get("d").toString();
        String letterE = jsonF.getJSONObject("c").get("e").toString();
        String letterC = jsonF.getJSONObject("c").toString();
        jsonF.remove("c");
        jsonF.put("c" + "." + "d", letterD);
        jsonF.put("c" + "." + "e", letterE);
        System.out.println(jsonF);
        String jsonFStr = jsonF.toString();

        //PrintWriter pw = null;

        try {
            //pw = new PrintWriter(new FileWriter("/output.json"));
            FileWriter fw = new FileWriter("C:/Users/acruz/OneDrive - Technological University Dublin/Documents/School/Year 3/Year 3 Semester 2/MongoDB Coding Challenge/allyannacruz/assessment/src/output.json");
            fw.write(jsonFStr);
            fw.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Cannot write file" + e.toString());
        } 
        

    } // end JSONParse()
} // end JSONProj class
