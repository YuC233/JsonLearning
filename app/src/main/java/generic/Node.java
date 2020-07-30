package generic;

/**
 * @author : BenjaminHe
 * @date : 2020-07-30 14:43
 * @desc :
 */
public class Node<T> {
    private T value;

    public Node() {

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(T value) {
        this.value = value;
    }
}
