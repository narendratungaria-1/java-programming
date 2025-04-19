package oops.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayslistexample {
    public static void main(String[] args) {
        ArrayList<String> List= new ArrayList<>();
        List.add("narendra");


        String []array = new String[2];
        array[0]="narendra";
        array[1]= "tungaria";
        String []array1 = new String[array.length+1];
        for (int i = 0; i < array.length; i++) {
            array1[i] =array[i];

        }
        array1[array1.length-1]="harshita";
        System.out.println(Arrays.toString(array1));

        String[] resultArray = new String[array1.length - 2]; // 2 elements will be removed
        int index = 0;

        // Loop through array1 and copy elements to resultArray, skipping "tungaria" and "harshita"
        for (String str : array1) {
            if (!str.equals("tungaria") && !str.equals("harshita")) {
                resultArray[index++] = str;
            }
        }

        // Print the result array
        System.out.println(Arrays.toString(resultArray));

//        task = [narendra,tungaria,harshita,kiran,lakshya,tungaria,tungaria]
//        delete all tungaria
//         add choudhary to the list


        String []array2 = new String[array1.length+4];
        for (int i = 0; i < array1.length; i++) {
            array2[i] =array1[i];

        }
        array2[array2.length-4]="kiran";
        array2[array2.length-3]="lakshya";
        array2[array2.length-2]="tungaria";
        array2[array2.length-1]="tungaria";
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        int uniqueCount = 1;

        for (int i = 1; i < array2.length; i++) {
            if (!array2[i].equals(array[i - 1])) {
                array2[uniqueCount] = array2[i];
                uniqueCount++;
            }
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}



    
