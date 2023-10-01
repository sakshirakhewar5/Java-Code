public class DigitsWord {
    public static void main(String[] args) {
        int r,n,num;
        String Digits="";
        n=12;
        num=n;
        while(num>0){
            r=num%10;
            switch(r){
                case 0:
                    Digits ="Zero"+Digits;
                    break;
                case 1:
                    Digits ="One"+Digits;
                    break;
                case 2:
                    Digits ="Two"+Digits;
                    break;
                case 3:
                    Digits ="Three"+Digits;
                    break;
                case 4:
                    Digits ="Four"+Digits;
                    break;
                case 5:
                    Digits ="Five"+Digits;
                    break;
                case 6:
                    Digits ="Six"+Digits;
                    break;
                case 7:
                    Digits ="Seven"+Digits;
                    break;
                case 8:
                    Digits ="Eight"+Digits;
                    break;
                case 9:
                    Digits ="Nine"+Digits;
                    break;
            }
            num=num/10;

        }
        System.out.println("Digits = "+n);
        System.out.println("Digits into World = "+Digits);
    }
}
