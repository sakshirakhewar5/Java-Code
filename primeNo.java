public class primeNo {
    public static void main(String[] args) {
       int i,m=0,flag=0;
       int n=8;
       m=n/2;
       if(n==0 || n==1){
        System.out.println("not prime no");
       }
       else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("not prime no");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime no");
        }
       }
        
    }
}

/*
 * static boolean isPrime(int n){
          if(n==1||n==0)
		  return false;
   
          for(int i=2; i<n; i++){
                if(n%i==0)
				return false;
          }
          return true;
    }
 
    public static void main (String[] args)
    {
        int N = 100;
        for(int i=1; i<=N; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
 */