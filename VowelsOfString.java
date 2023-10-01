class vowelsOfString{
    static int count=0;
    public static void main(String[] args) {
        String s=new String("Hii there is hello wrold");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='i'){
                System.out.println("Give string vowels "+s.charAt(i)+" index of "+i);
                count++;
            }
        }System.out.println("total no of vowels"+count);
    }
}