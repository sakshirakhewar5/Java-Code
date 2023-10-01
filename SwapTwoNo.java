public class SwapTwoNo {
    public static void main(String[] args) {
        //Without using temp
        int a=10;
        int b=20;
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("==================");
        //With using temp

        int s=40;
        int s1=50;
        int temp=0;
        
        temp=s;
        s=s1;
        s1=temp;
        System.out.println("s = "+s);
        System.out.println("s1 = "+s1);

    }
}
