import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test01 {
    /*
    Design a stack class that supports push, pop, top, and retrieving the maximum element.

    The stack stores integers only.

    push(int x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMax() -- Retrieve the maximum element in the stack.
     */
    public static void main(String[] args) {
        StackClass stackClass = new StackClass();
        stackClass.push(1);
        stackClass.push(2);
        stackClass.push(3);
        stackClass.push(4);
        stackClass.push(5);
        stackClass.push(6);
        System.out.println(stackClass.getMax());

        stackClass.pop();
        System.out.println(stackClass.getMax());

        int top = stackClass.top();
        System.out.println(top);
        System.out.println(stackClass.getMax());
    }

    public static class StackClass {
        private List<Integer> list = new ArrayList<Integer>();

        void push(int i) {
            list.add(0, i);
        }

        void pop() {
            list.remove(0);
        }

        int top() {
            Integer top = list.get(0);
            this.pop();
            return top;
        }

        int getMax() {
            Optional<Integer> maxOpt = list.stream().max(Comparator.comparing(Integer::valueOf));
            return maxOpt.isPresent() ? maxOpt.get() : -1;
        }
    }
}
