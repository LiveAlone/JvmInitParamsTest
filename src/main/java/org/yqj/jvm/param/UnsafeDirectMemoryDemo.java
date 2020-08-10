package org.yqj.jvm.param;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/8/8
 * Email: yaoqijunmail@foxmail.com
 */
public class UnsafeDirectMemoryDemo {

    public static final int _10M =  1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        for (; ; ) {
            unsafe.allocateMemory(_10M);
        }
    }
}
