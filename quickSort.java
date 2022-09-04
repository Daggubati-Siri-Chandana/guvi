public class quickSort {
    public static void main(String args[]){
        int arr[] = {10,80,30,90,40,50,70};
       int i =-1, j=0,pivot = arr[arr.length-1]; 
    //    System.out.println("i "+i+" j "+j+" pivot = "+pivot);
    for(int k = 0;k<arr.length;k++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        j++;
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
        System.out.print("-----n");
    }
    }
}
