//Sum oF all Elemnts in arrays integer
public class SumOfArrayElem {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }System.out.println("Sum Of Arrays integer elements = "+ sum);
    }
}
