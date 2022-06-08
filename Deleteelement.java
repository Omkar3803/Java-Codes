public class Deleteelement {

    public static void main(String[] args) {

        //take an array
        int arr[]={30,40,50,70,80,90};
        //take an variable
        int dele_ele = 70;
        //Travese an array
        for(int i=0;i< arr.length;i++)
        {
            if(dele_ele==arr[i])
            {
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
