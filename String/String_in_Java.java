public class String_in_Java {

    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));

        String s1 = "geeks";
        String s2 = "geeks";

        if (s1 == s2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s3 = new String("geeks");
        if (s1 == s3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
