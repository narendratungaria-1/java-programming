public class minmax {
    public static void main(String[] args) {
        int a = 3;
        int b= 4;
        int c =2;
        int d = 1;
        String max = null; 
        String min=null;
        if(a>b&&a>c&&a>d){
            max = "a";
            if(b<c&&b<d){
             min ="b";
 
            }
            else if(c<d){
             min ="c";
            }
            else{
             min ="d";
            }
         }  else if (b>c&&b>d){
             max = "b";
             if(a<c&&a<d){
                 min= "a";
             }else if(c<d){
                 min ="c";
             }else{
                 min = "d";
             }
         }  else if (c>d){
             max = " c";
             if(a<b&&a<d){
                 min ="a";
             }else if(b<d){
                 min="b";
             }else{
                 min="d";
             }
         }  else {
             max = "d";
             if(a<b&&a<c){
                 min="a";
             }else if(b<c){
                 min ="b";
             }else{
                 min ="c";
             }
         }
         System.out.println("max number: "+max);
         System.out.println(" min number: "+min);

    }
    
}
