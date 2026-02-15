public class stringhalves{
    public static void main(String[] args) {
       String str="textbook";

         String a=str.substring(0,str.length()/2);
         String b=str.substring(str.length()/2);

         
        String vowels ="aeiouAEIOU";
        int leftvowels=0, rightvowels=0;

        for(int i=0;i<a.length();i++){
            if(vowels.contains(String.valueOf(a.charAt(i)))){
                leftvowels++;
            }

        }
        for(int i=0;i<b.length();i++){
            if(vowels.contains(String.valueOf(b.charAt(i)))){
                rightvowels++;
            }

        }
        if(leftvowels==rightvowels){
           System.out.println("true");
        }
        else{
            System.out.println("false");
        }
}
}