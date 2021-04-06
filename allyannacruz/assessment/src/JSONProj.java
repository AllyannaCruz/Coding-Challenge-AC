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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONProj {
    public static void main(String[] args) throws Exception{
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
        JSONProj jp = new JSONProj();
        JSONProj.JSONParse();
        
    } // end main()

    public static void JSONParse() throws Exception {
        File testj = new File("test1.txt");

       
        System.out.println("File exists");
        //InputStream tj = new FileInputStream(testj);
        InputStream is = JSONProj.class.getResourceAsStream("test1.txt");
        String testTxt  = IOUtils.toString(is, "UTF-8");
        //String testJSON = IOUtils.toString(tj, "UTF-8");
        //System.out.println(testJSON);
        System.out.println(testTxt);

            //JSONObject jsonF = new JSONObject(testJSON);

            // String letterD = jsonF.getJSONObject("c").get("d").toString();
            // String letterE = jsonF.getJSONObject("c").get("e").toString();
            // String letterC = jsonF.getJSONObject("c").toString();

    } // end JSONParse()
} // end JSONProj class
