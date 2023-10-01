class WhitespaceRemoveString{
    public static void main(String[] args) {
        String s="jhkh fjkh     ee";
        String s1="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);

            if(!Character.isWhitespace(ch)){
        
                s1+=ch;
            }
        }System.out.println(s1);
    }

}