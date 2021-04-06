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

The second method JSONParse() parses test1.txt into a string then into a JSON object. 
I removed key c and added in c.d as the key with the value 3 and c.e as the key and "test" as the value. 
I converted the JSON object to a string so that a new .json file can be written and saved in a folder.

I used the linux command cat test1.json JSONProj.java and here is the output:



