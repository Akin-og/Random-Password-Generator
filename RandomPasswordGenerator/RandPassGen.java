import java.util.Random;
import java.util.Scanner;

public class  RandPassGen {
    public static String Generator(){
        System.out.println("Hello, Enter password length: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        String[] alphaCap = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
                "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] alphaLow = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] numeric = {0,1,2,3,4,5,6,7,8,9};
        String[] symbol = {"!","@", "#","$","?","%"};
        Random random = new Random();

        String ans ="";


        while( ans.length()<userInput){
            int getAlpha = random.nextInt(alphaCap.length);
            int getAlphaLow = random.nextInt(alphaLow.length);
            int getNumeric= random.nextInt(numeric.length);
            int getSymbol = random.nextInt(symbol.length);
            
            if(ans.length()<userInput){
                ans+=alphaCap[getAlpha];
            }
            if(ans.length()<userInput){
                ans+=alphaLow[getAlphaLow];
            }
            if(ans.length()<userInput){
                ans+=numeric[getNumeric];
            }
            if(ans.length()<userInput){
                ans+=symbol[getSymbol];

            }

        }

     return ans;
    }


    public static void main (String[] args){
        System.out.println("Random password: "+Generator());

    }
}
