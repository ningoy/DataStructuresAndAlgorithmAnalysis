package cha1;

/**
 * @author ningoy
 * @version V1.0
 * @Package cha1
 * @Description: TODO
 * @date 2020/5/27 20:30
 */
public class MemoryCell {

    private Object storedValue;

    public Object read() {
        return storedValue;
    }

    public void write(Object x) {
        storedValue = x;
    }
}
