import java.util.function.BiPredicate;

public class BetterStrMain {
    public static void main(String[] args) {

    String first="dasdasda";
    String secound="dasd";
    System.out.println(betterString(first,secound,(s1, s2) -> s1.length() > s2.length()));
        System.out.println(betterString(first,secound,(s1, s2) -> false));


    }



    public static String betterString(String s1, String s2, BiPredicate<String,String>p){
        if(p.test(s1,s2)){
            return s1;
        }
        else return s2;
    }
}
