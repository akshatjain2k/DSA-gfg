package AdvanceJava;

public class test {
    public static void main(String[] args) {
        
        int N=3;
        for(int i = 2; i<=2*N; i++){
            if(i%2 == 0 && i % N == 0 ){
                System.out.println(i);
                break;
            }
        }
    }
}
