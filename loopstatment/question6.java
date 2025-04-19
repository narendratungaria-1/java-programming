package loopstatment;

public class question6 {
    public static void main(String[] args) {
        
        int n = 5; 
    
          
            for (int i = 1; i <= n; i++) {
              
                for (int j = 1; j <= n; j++) {
                    if(i%2!=0&&j==1||i%2!=0&&j==5||j==3&&i==1||j==3&&i==5){
                        System.out.print("1");
                    }
                    else if(i%2==0&&j==1||j==5||j==2&&i==1||j==4&&i==1||j==2&&i==5&&j==4&&i==5||j==2&&i==5||j==4&&i==5){
                        System.out.print("0");
                    }
                    
                    else{
                        System.out.print(" ");
                    }
                   
                   
                }
                System.out.println();
               
    }
    
    }
}
