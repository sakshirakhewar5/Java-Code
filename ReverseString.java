class ReverseString{
    public static void main(String[] args) {
        String s="Hello";
        String s1="";
        char ch;

        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            s1=ch+s1;
        }
        System.out.println(s1);
    }
}