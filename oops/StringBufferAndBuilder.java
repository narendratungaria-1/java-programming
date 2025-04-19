package oops;

import java.util.Date;

public class StringBufferAndBuilder
{
    public static void main(String[] args)
    {
        String plotNo = "";
        String area = "";
        String landMark = "";
        String fullAddress = plotNo + area + landMark;
        // immutable
        String collegeAddress = "GIT"; // new objet
        //collegeAddress += ", SITAPURA"; // new object
        collegeAddress = collegeAddress.concat(", SITAPURA"); // new object
        collegeAddress += ", JAIPUR"; // new object
        collegeAddress += ", RAJASTHAN"; // new object
        collegeAddress += "- 302026"; // new object
        System.out.println("collegeAddress "+collegeAddress);

        String[] array = {"GIT","SITAPURA","JAIPUR","RAJASTHAN","302025","INDIA"};
        String collegeFullAddress = null;
        for(String value : array)
        {
            //System.out.println("value "+value);
            collegeFullAddress += ", "+value;
        }
        System.out.println("collegeFullAddress "+collegeFullAddress);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GIT");
        stringBuilder.append(", SITAPURA");
        stringBuilder.append(", JAIPUR");
        stringBuilder.append(", RAJASTHAN");
        System.out.println("stringBuilder "+stringBuilder);
        ///
        StringBuilder collegeAddressBuilder = new StringBuilder();
        for(String value : array)
        {
            collegeAddressBuilder.append(", ").append(value);
        }
        System.out.println("collegeAddressBuilder "+collegeAddressBuilder);
        String builderStr = collegeAddressBuilder.toString();

        StringBuilder stringBuilder1 = new StringBuilder(); // default capacity 16
        System.out.println(stringBuilder1.capacity());
        stringBuilder1.append("jitendra");
        stringBuilder1.append("yadav");
        stringBuilder1.append("sikar");
        System.out.println("len : "+stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());
        stringBuilder1.append("jitendra");
        stringBuilder1.append("yadav");
        stringBuilder1.append("sikar");
        System.out.println("len : "+stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());

        StringBuilder stringBuffer = new StringBuilder(); // 863
        long beforeTimeMS = new Date().getTime();
        System.out.println("before "+beforeTimeMS);
        /*for(int i =0; i < 10000000; i++)
        {
            stringBuffer.append(i);
            stringBuffer.append(i);
        }*/
        long afterTimeMS = new Date().getTime();
        System.out.println("after "+afterTimeMS);
        System.out.println("difference "+(afterTimeMS - beforeTimeMS));

        StringBuilder stringBuilder2 = new StringBuilder("jitenda");
        //stringBuilder2.append("r",5,1);
        stringBuilder2.insert(6,'r');
        System.out.println(stringBuilder2);


        {
//            task 1 :
//            "ab" = 'a','b','ab'
//                    ["abc"='a','b','c','ab','ac','bc','abc']c
            String input = "ab";
            StringBuilder result = new StringBuilder();

            // Start building the output
            result.append("\"").append(input).append("\" = ");

            // Use a for loop to add individual characters
            for (int i = 0; i < input.length(); i++) {
                result.append("'").append(input.charAt(i)).append("'");
                if (i < input.length() - 1) {
                    result.append(", "); // Add a comma for all but the last element
                }
            }

            // Add the combination of the entire string
            result.append(", '").append(input).append("'");

            // Print the result
            System.out.println(result.toString());
        }

    }
}