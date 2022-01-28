package Recursion;

class Print_integer {
    
    static void printNto1(int n){
        if(n==0)
            return;
        
        System.out.println(n);
        printNto1(n-1);
        
    }
    static void print1toN(int n){
        if(n==0)
            return;
        
        print1toN(n-1);
        System.out.println(n);
        
        
    }


    public static void main(String[] args) {
        printNto1(4);
        print1toN(4);
    }
}