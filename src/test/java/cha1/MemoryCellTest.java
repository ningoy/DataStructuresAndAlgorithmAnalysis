package cha1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ningoy
 * @version V1.0
 * @Package cha1
 * @Description: TODO
 * @date 2020/5/27 20:36
 */
public class MemoryCellTest {

    MemoryCell m = new MemoryCell();

    @Test
    public void read() {
        m.write("37");
        String val = (String) m.read();
        System.out.println("Contents are: " + val);
        assertEquals("37", val);
    }

    @Test
    public void write() {
        m.write("37");
        String val = (String) m.read();
        System.out.println("Contents are: " + val);
        assertEquals("37", val);
    }

    @Test
    /**
     * 在Java5之前，这是需要的，因为如果一个int型的量被放到需要Integer对象的地方，那么编译将会产生一个错误信息。
     * Java5实现了自动装箱和自动拆箱，但是在类的实例化过程中，int不能代替Integer。
     */
    public void wrapper() {
        m.write(new Integer(37));
        Integer wrapperVal = (Integer) m.read();
        int val = wrapperVal.intValue();
        System.out.println("Contents are: " + val);
        assertEquals(37, val);
    }

}