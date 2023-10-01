//Find max and min numbers in arrays
public class MaxNumberArray {
    public static void main(String[] args) {
        int arr[]={22,4,5,6,78,99};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }System.out.println(max);
    }
}
