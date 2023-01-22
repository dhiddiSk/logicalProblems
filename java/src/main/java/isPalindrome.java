public boolean isPalindrome(String s) {
    // This function validates if the string is same even when it is reveresed.
        StringBuffer sb1 = new StringBuffer();
        s = s.toLowerCase();
     
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb1.append(s.charAt(i));
        }}
        StringBuffer sb2=new StringBuffer();
        sb2.append(sb1);
        sb2.reverse();
        boolean a=(sb1.toString().equals(sb2.toString()));
        return a;
 }
