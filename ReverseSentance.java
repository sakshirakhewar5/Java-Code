public class ReverseSentance {
    public static void main(String[] args) {
        String str="The Kiran ";
        String rev="";
        
        String s[]=str.split(" ");
        for(int i=0;i<s.length;i++){
            rev=s[i]+" "+rev;
        }
        System.out.println(rev);
    }
}
