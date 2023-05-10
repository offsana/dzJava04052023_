package Work2;

public class Work2 {
    public static void main(String[] args) {
        String text = new String ( new char[]{'I',' ','s','t','u','d','y',' ','B','a','s','i','c',' ','J','a','v','a','!'});
        //--String text = "I study Basic Java!";
        String text2 = "I study Basic Java!";
        char t = text2.charAt(18);
        boolean r = text2.contains("Java");
        String s = text2.replace('a','o');
        //String n = text2.substring('13','3');


        System.out.println(text);
        System.out.println(t);
        System.out.println(r);
        System.out.println(s);
        System.out.println(text2.toUpperCase());
        System.out.println(text2.substring(14));
    }
}