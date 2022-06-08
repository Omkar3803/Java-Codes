public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60};
        //take a variable
        int search =50;
        //traverse an array
        for(int i=0; i< arr.length;i++)
        {
            if(search == arr[i])
            {
                System.out.print("search present at "+i+" index position");
            }
        }
    }
}
