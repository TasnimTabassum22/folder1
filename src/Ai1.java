public class Ai1 {
    // Java program to sort a stack using
// a auxiliary stack.
import java.util.*;

    class SortStack
    {
        // This function return the sorted stack
        public static Stack<Integer> sortstack(Stack<Integer>
                                                       input)
        {
            Stack<Integer> tmpStack = new Stack<Integer>();
            while(!input.isEmpty())
            {
                // pop out the first element
                int tmp = input.pop();

                // while temporary stack is not empty and
                // top of stack is greater than temp
                while(!tmpStack.isEmpty() && tmpStack.peek()
                        > tmp)
                {
                    // pop from temporary stack and
                    // push it to the input stack
                    input.push(tmpStack.pop());
                }

                // push temp in tempory of stack
                tmpStack.push(tmp);
            }
            return tmpStack;
        }
}
