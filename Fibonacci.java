public class Fibonacci {
    static int n1=0;
    static int n2=1;
    static int n3;
    public static void main(String[] args){
       System.out.print(n1+" "+n2);
       for(int i=2;i<=10;i++){
        n3=n1+n2;
       n1=n2;
       n2=n3;
       System.out.print(" "+n3);
       }
      
    }
}
 