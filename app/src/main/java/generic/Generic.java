package generic;

/**
 * @author : BenjaminHe
 * @date : 2020-07-30 14:45
 * @desc :
 */
public class Generic {
    public static void main(String[] args) {
        new Generic().run();
    }

    private void run() {
        Node<Integer> nodeInt = new Node<Integer>();  //声明类型
        nodeInt.setValue(10);//赋值
        System.out.println("-------INT值为：" + nodeInt.getValue());
        Node<Double> nodeDouble = new Node<Double>();
        nodeDouble.setValue(1212.12);
        System.out.println("--------Double的值为：" + nodeDouble.getValue());
    }
}
