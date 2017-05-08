package TreeTest;

/**
 * Created by ln on 2017/5/8.
 */
public class Code {
    //左
    public Code left;
    //右
    public Code right;
    //频率
    public int key;
    //字符
    public char value;

    public Code(int key, char value) {
        this.key = key;
        this.value = value;
        left = null;
        right = null;
    }
}
