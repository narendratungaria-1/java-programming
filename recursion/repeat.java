package recursion;

public class repeat {
    public static void main(String[] args) {
        int arr[]= {1,2,3,2,4,2,4,2};
        System.out.println(recount(arr,0));

    }
    static int recount(int array[],int index){
        if (index== array.length){
            return 0;
        }

        int count = (array[index] == 2) ? 1 : 0;


        return count + recount(array, index + 1);

    }

}
