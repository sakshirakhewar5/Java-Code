public class SortingArray {
    public static void main(String[] args) {
        int arr[]={2,9,0,12,34,66,69,2,4};
        System.out.println("Sort in acending order : ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }System.out.println(arr[i]);
        }
    }
}
/*
main()
 int arr[]={1.33.4.55.68.99};
 Arrays.sort(arr);
 for(int i;i<arr.length;i++){
    System.out.println(arr[i])
 }
 */
