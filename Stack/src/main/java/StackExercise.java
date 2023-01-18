import java.util.Deque;
/**
 * Stacks are LIFO - last in, first out, like a stack of plates or books, or the puzzle game "Towers of Hanoi".
 * They are used in algorithms where it is needed to keep track of the ordering in which the elements were inserted.
 *
 * ArrayDeque fills the role of *both* queues and stacks. You could think of a Deque as a deck of cards (pronounced the
 * same) where you could remove cards from either the top or bottom. You can use ArrayDeque
 * to perform stack operations. You can read about ArrayDeque in the official Javadocs here:
 * https://do
  */
    public class StackExcersice {

     /** @param stack A Deque of Strings.
     * @return the number of elements in the deque.
     */
    
    public int getSize(Deque<String> stack){
        return stack.size();
    }

    /**
     * Add a value to the top of the deque.
     * @param stack A Deque of Strings.
     * @param item a String to be added to the deque.
     */
    public void addToTopOfStack(Deque<String> stack, String item){
        stack.add(item);
    }

    /**
     * Remove the value from the top of the deque and return that value.
     * (The method used to remove items from a stack also returns the value.)
     * @param stack A Deque of Strings.
     * @return the value popped from the top of the deque.
     */
    public String removeFromTopOfStack(Deque<String> stack){
        return stack.remove();
    }
    /**
     * Return the value at the top of a deque without removing the value.
     * @param stack A Deque of Strings.
     * @return the value peeked from the top of the deque.
     */
    public String getTopOfStackWithoutRemoving(Deque<String> stack){
        return stack.peek();
    }
}
