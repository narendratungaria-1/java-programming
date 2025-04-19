package oops.String;

import java.util.Arrays;

public class pract {
    public static void main(String[] args) {
        String str1 = "narendra";
        System.out.println(str1);
        str1.concat("tungaria");
        System.out.println(str1);
        System.out.println(str1);
//string intern
        String value_11 = "vishal";
        String value_12 = new String("vishal").intern();
        System.out.println(value_11 == value_12);
        String value_13 = value_12;
        System.out.println(value_11==value_13);
        System.out.println(value_12==value_13);
        System.out.println(value_11);

//
        String hellostr= "Hello";
        System.out.println(hellostr);
        System.out.println(hellostr.toCharArray());
        char[]testchar = {'a','b'};
        System.out.println(testchar);
        System.out.println(testchar.toString());
        System.out.println(Arrays.toString(testchar));
        char[] hellostrArray =hellostr.toCharArray();
        System.out.println(hellostrArray);
        System.out.println(Arrays.toString(hellostrArray));


        //Task 3- "Hello" : "olleh"
        //Task 2- "Hello World" : "olleh World"
        //Task 1 - "Hello WOrld" : "Hello dlroW"
         String dob = "12-32-145576";
         String[] dobArray = dob.split("-");
        System.out.println(Arrays.toString(dobArray));

    //task1
        String str= "Hello";
        String reversed ="";
        for (int i = str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);

        }
        System.out.println(reversed);
        String str3= "Hello World";

        String[] word = str3.split(" ");

      char[] firstString = word[0].toCharArray();
      char[] secondString =word[1].toCharArray();
      for (int i = 0;i<firstString.length/2;i++){
        char temp = firstString[i];
            firstString[i]= firstString[firstString.length-1-i];
          firstString[firstString.length-1-i] = temp;
       }

        System.out.println(new String(firstString)+" "+word[1]);
        for (int i = 0;i<secondString.length/2;i++){
            char temp = secondString[i];
            secondString[i]= secondString[secondString.length-1-i];
            secondString[secondString.length-1-i] = temp;}
        System.out.println(word[0]+" "+new String(secondString));
    }



    }


