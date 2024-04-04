package stacks;

public class Main {

    public static void main(String[] args) throws CustomException {
        CustomStacks stack = new CustomStacks();
        System.out.println(stack.push(4));
        System.out.println(stack.push(4));
        System.out.println(stack.push(4));
//        System.out.println(stack.push(4));

        CustomStacks stack2 = new DynamicStack(2);

        System.out.println(stack2.push(4));
        System.out.println(stack2.push(5));
        System.out.println(stack2.push(4));
        stack2.pop();
        stack2.pop();
        stack2.pop();
    }
}
