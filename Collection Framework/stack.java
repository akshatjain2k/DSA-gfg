import java.util.Stack;

class stack {
    
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);
        
    }
}
