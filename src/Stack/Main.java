package Stack;

public class Main {
    public static void main(String[] args){
        SlinkStack<Integer> stack = new SlinkStack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("the top is "+stack.peek());
        System.out.println("the top is "+stack.pop());
        while (!stack.isEmpty()){
            System.out.println("element remove "+stack.pop());
        }
    }
}
