public class VowelsFinder {
    public static void main(String[] args) {
        String n = "hemesh";
        String v = "aeiou";
        int c=0;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (v.indexOf(ch) != -1) {
                a.append(ch).append(" ");
                c++;
            }
        }
        System.out.println("Vowels in your name:" + a.toString().trim());
        System.out.println(c);
    }
}