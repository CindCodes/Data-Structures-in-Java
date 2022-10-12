import java.util.Stack;

public class Main {
    public static int evaluate(String exp){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            stack.push(c-'0');
            else{
                int x=stack.pop();
                int y=stack.pop();

                switch(c){
                    case '+':
                    stack.push(y+x);
                    break;
                    case '-':
                    stack.push(y-x);
                    break;
                    case '/':
                    stack.push(y/x);
                    break;
                    case '*':
                    stack.push(y*x);
                    break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String exp="21+4*";
        System.out.println("Post-fix value: "+evaluate(exp));
    }
}
