import com.sun.source.tree.BreakTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome ------------");
        System.out.println(isPalindrome(6));
        System.out.println(isPalindrome(28));
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(-1));

    }
    public static boolean isPalindrome(int num1) {
        num1 = Math.abs(num1); // mutlak değer için kullanılır.
        char[] digits = String.valueOf(num1).toCharArray(); // string arrayine dönüştürüp char arrayine dönüştürdk
        String reversed = "";

        for(int i = digits.length -1 ; i>=0; i--){
            reversed += digits[i];
        }
        return  Integer.parseInt(reversed) ==num1;
         //return reversed.equals(String.valueOf(num1)); alternatif return

    }

    public static boolean isPalindromeSecond (int num1){
        int orininalNum =Math.abs(num1);
        int reversedNumber = 0;
        while (num1>0){
            int digit = num1%10;
            reversedNumber = reversedNumber * 10 + digit;
            num1 =num1 / 10;
        }
        return orininalNum == reversedNumber ;
    }

    public static boolean isPerfectNumber (int num1){
        if(num1  <=0) {
            return false;
        }
        int sum=0
        for(int i=1; 1 <= num1 /2; i++){
            if(num1 % i ==0){
                sum += i;
            }
            return num1 == sum;
        }


    }




    public static String numberToWords(int num) {
        if(num < 0 ) {
            return "Invalid Value";
        }
        String text = "";
        char[] numArray = String.valueOf(num).toCharArray();
        for(char digit:numArray) {
            switch (digit) {
                case '0':
                    text += "Zero";
                    break;
                case '1':
                    text += "One";
                    break;
                case '2':
                    text += "Two";
                    break;
                case '3':
                    text += "Three";
                    break;
                case '4':
                    text += "Four";
                    break;
                case '5':
                    text += "Five";
                    break;
                case '6':
                    text += "Six";
                    break;
                case '7':
                    text += "Seven";
                    break;
                case '8':
                    text += "Eight";
                    break;
                case '9':
                    text += "Nine";
                    break;
            }

        }
        return text.trim();
    }
}










