public class closest_palindrome {
    
    static void palindrome(){
        int n = 76;
        for(int i =2; i<n/2; i++){
            if(n % i == 0)
                System.out.println();
            else if(n % i != 0)
                System.out.println(n +" is a palindrome");
                break;                
        }
        int m;
        for(int i =2; i<n/2; i++){
            if(n % i == 0)
                System.out.println();
            else if(n % i != 0)
                System.out.println(n +" is a palindrome");
                break;                
        }

     }

    public static void main(String[] args) {
        palindrome();
    }
}