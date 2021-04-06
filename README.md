# Coding-Challenge-MongoDB
Author: Allyanna Cruz

Program that inputs a JSON object and outputs a flattened version.

The libraries used are the org.json and org.apache.commons.
The .jar files are in the lib folder.
Please change the path on JSONInput() and JSONParse() so that a .json file can be saved in your system.

When the program is ran, the user is prompted for an input 1 or 2.
I included two ways to input and output the test1.txt or test1.json file because I wasn't sure which approach would be best.
The first method JSONInput() takes in the user input, with key value ppairs like on the test1.json provided on the instructions.
The output is a flattened version of the input.
The value of key c is d and the value of key d (value4) is 3.
The screenshot below demonstartes this. The screenshots are also in the screenshot folder.
![image](https://user-images.githubusercontent.com/55791523/113771329-22483200-971b-11eb-9f24-a2a55aaf2645.png)
![image](https://user-images.githubusercontent.com/55791523/113771369-2ecc8a80-971b-11eb-88a7-72f8df719c21.png)



The second method JSONParse() parses test1.txt into a string then into a JSON object. 
I removed key c and added in c.d as the key with the value 3 and c.e as the key and "test" as the value. 
I converted the JSON object to a string so that a new .json file can be written and saved in a folder.
![image](https://user-images.githubusercontent.com/55791523/113771397-37bd5c00-971b-11eb-8ca6-b897d3ac3d13.png)
![image](https://user-images.githubusercontent.com/55791523/113771415-3db33d00-971b-11eb-8e1e-a1411a501353.png)



I used the linux command cat test1.json JSONProj.java and here is the output:
![image](https://user-images.githubusercontent.com/55791523/113771448-473ca500-971b-11eb-8f97-3da2b74c72b8.png)

Switch statement
![image](https://user-images.githubusercontent.com/55791523/113771485-54599400-971b-11eb-8229-56ca3491f88f.png)




