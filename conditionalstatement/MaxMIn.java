//package conditionalstatement;
//
//public class MaxMIn {
//    public static void main(String[] args) {
//        int a= 190;
//        int b=49;
//        int c=56;
//        int d=79;
//        String max = null;
//        String max2 = null;
//        if (a>b && a>c && a>d){
//            max = "a";
//            if (b>c && b>d){
//                max2 = "b";
//            } else if (c>b && c>d) {
//                max2= "c";
//            }
//            else {
//                max2 ="d";
//            }
//        }
//        else if (b>a && b>c && b>d ) {
//            max= "b";
//            if (a>c && a>d){
//                max2= "a";
//            }
//            else if (c>a && c>d) {
//                max2 = "c";
//            }
//            else{
//                max2= "d";
//            }
//        }
//        else if (c>a && c>b && c>d) {
//            max = "c";
//            if (a>b && a>d){
//                max2 = "a";
//            }
//            else if (b>a && b>d) {
//                max2= "b";
//            }
//            else{
//                max2="d";
//            }
//        }
//        else{
//            max ="d";
//             if (a>b && a>c ){
//                 max2="a";
//             } else if (b>a && b>c) {
//                 max2="b";
//             }
//             else{
//                 max2 = "c";
//             }
//        }
//        System.out.println("Maximum : "+max);
//        System.out.println("Second Maximum : "+max2);
//    }
//}

public class MaxMIn {
    public static void main(String[] args) {
        int a =82;
        int b =33;
        int c=93;
        int d =65;
        String max = a>b && a>c && a>d ? "a" : b>c && b>d ?"b" :c>d ?"c":"d";
        String min = a<b && a<c && a<d ? "a" : b<c && b<d ?"b" :c<d ?"c":"d";
        System.out.println(max);
        System.out.println(min);
    }
}
