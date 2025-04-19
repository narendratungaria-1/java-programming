package oops.String;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {

                String str = "aakash";
                char chars = 'a';
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == chars) {
                        count++;
                    }
                }
                System.out.println(count);






//                int temp = 0;
//                int current = 0;
//                char[] maxchar = new char[str.length()];
//                for(int i = 0; i<=str.length();i++){
//                    char ch = str.charAt(i);
//                    for(int j = i+1;j<str.length();j++){
//                    char ch1 = str.charAt(j);
//                    if(ch==ch1){
//                        count++;
//                    }
//                    }
//                    if (count > temp)
//                    {
//                        temp = count;
//                        maxchar[current] = ch;
//                        current++;
//                    }
//                }
//


                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    int count1= 0;

                    if (str.indexOf(c) == i) {
                        for (int j = 0; j < str.length(); j++) {
                            if (str.charAt(j) == c) {
                                count1++;
                            }
                        }
                        System.out.print(count1 + " ");
                    }
                }

          for(int i = 0 ; i <str.length();i++){
              char chh = str.charAt(i);

          }


            }
        }



        // task 1: " aakash ";
        // count a occurance : output : 3

        // task 2: " aakash ";
        // count every character occurance: output : [3, 1, 1, 1]

        // task 3: " aakash ";
        // found character coming maximum time: output: a

        // task 4 " aakash "
        // remove duplicate character: output :"aksh"


