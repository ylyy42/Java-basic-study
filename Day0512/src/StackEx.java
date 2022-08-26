import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Java StackEx 수식입력");
			System.out.println("Ex : Java StackEx ((2+3)*15+(+2))");
			System.exit(0);
		}
		Stack stack = new Stack();
		String exp= args[0];
		System.out.println(exp);
		try {
			for(int i = 0; i < exp.length(); i++) {
				char ch = exp.charAt(i);
				if(ch == '(') {
					stack.push(ch+"");
				} else if (ch == ')') {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				System.out.println("괄호의 짝이 맞습니다.");
			} else {
				System.out.println("괄호의 짝이 맞지않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호의 짝이 맞지않습니다.");
		}
	}
}
