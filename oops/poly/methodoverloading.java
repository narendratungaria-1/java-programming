package oops.poly;

import com.sun.tools.javac.Main;

public class methodoverloading {

// parameter = which is declared
// argument= which is called and value is passed
   public void sum(){
       System.out.println("no number found");

   }
   public int sum(int a){
       int b = a+a;
       return b;
   }

    public static void main(String[] args) {
        methodoverloading obj =new methodoverloading();
        obj.sum();

        int result = obj.sum(3);

    }
}
