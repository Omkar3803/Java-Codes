public class BinarySearch {
    public static void main(String[] args) {
        //take a sorted array
        int arr[] = {10,20,30,40,50,60,70,80,90};
        //take a variable
        int search = 50;
        int li =0;
        int hi= arr.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if(arr[mi]==search)
            {
                System.out.print("element present at "+mi+" index position");
                break;
            }

            else if(arr[mi]<search)
            {
                li =mi+1;

            }
            else {
                hi=mi-1;
            }
            mi= (li+hi)/2;

        }
        if(li>hi)
        {
            System.out.println("default");
        }
    }
}
