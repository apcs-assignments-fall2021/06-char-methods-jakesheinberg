public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch>=65&&ch<=90){
            int intval = ch+32;
            char charval = (char) intval;
            return charval;
        }else{
            char intval = ch;
            return intval;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if(ch>=97&&ch<=122){
            int intval = ch-32;
            char charval = (char) intval;
            return charval;
        }else{
            char intval = ch;
            return intval;
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
                String numberLess = "";
                int lenStr = str.length();
                for(int x=0; x<lenStr; x++ ){
                    char a = str.charAt(x);
                    if(a>=65 && a<=90){
                        numberLess= numberLess + a;
                    }else if(a>=97&&a<=122){
                        numberLess=numberLess+a;
                    }else if (a==32 || a==33){
                        numberLess=numberLess+a;
                    }
                }
                return numberLess;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        String x=removeNumbers("jake3");
    }
}
