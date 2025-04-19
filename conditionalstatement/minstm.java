public class minstm {
   
        public static void main(String[] args) {
            int a = 9;
            int b= 578;
            int c =9;
            int d = 111;
            String minimum = null; 
            String secondmin=null;
    
            if(a<b&&a<c&&a<d){
             minimum = "a";
               if(b<c&&b<d){
                secondmin="b";
    
               }
               else if(c<d){
                secondmin="c";
               }
               else{
                secondmin="d";
               }
            }  else if (b<c&&b<d){
             minimum = "b";
                if(a<c&&a<d){
                    secondmin= "a";
                }else if(c<d){
                    secondmin="c";
                }else{
                    secondmin= "d";
                }
            }  else if (c<d){
             minimum = " c";
                if(a<b&&a<d){
                    secondmin="a";
                }else if(b<d){
                    secondmin="b";
                }else{
                    secondmin="d";
                }
            }  else {
             minimum = "d";
                if(a<b&&a<c){
                    secondmin="a";
                }else if(b<c){
                    secondmin="b";
                }else{
                    secondmin="c";
                }
            }
            System.out.println("minimum number:"+minimum );
            System.out.println("second minimum number: "+secondmin);
        }
    }
    

