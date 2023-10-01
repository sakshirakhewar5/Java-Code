public class Palindrome {
public static void main(String[] args){
    int sum=0;
    int n=454;
    int temp=n;

        while(n>0){
        int r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
   
    if(temp==sum){
        System.out.println("Palindrome no");
    }else{
        System.out.println("No is not palindrome");
    }
}
}
