package __V1.data_structures.linear.queues;

import java.util.Queue;
import java.util.Stack;

/**
 * @author emmanuel
 */
public class QueueAlgorithms {

    public static void main(String[] args) {
        // empty
        System.out.println(simplifyPath("/home/"));
    }

    public static void reverseQue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        System.out.println(queue);
    }

    public static String simplifyPath(String path) {
        path = path.replaceAll("//", "/").trim();
        if (path.length() <= 1)
            return path;

        String[] paths = path.split("/");

        Stack<String> history = new Stack<>();

        for (String p : paths) {
            if (p.isBlank() || p.equals("."))
                continue;
         
            if (p.equals("..") && !history.isEmpty()) {
                history.pop();
                continue;
            }
            history.add(p);
        }

        return String.join("/", history);
    }
}
