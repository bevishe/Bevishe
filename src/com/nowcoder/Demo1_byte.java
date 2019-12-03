package com.nowcoder;

public class Demo1_byte {
    /*
    *
    * 牛客中的错题1.
    * 关于byte，short，char类型在计算中会自动提升到int类型，以此会犯的错误
    *
    * 原因是：
    * 1.JVM中没有直接操作byte的指令, 在Java虚拟机中，对于大部分与数据类型相关的字节码指令，他们的操作码助记符中都有特殊的字符来表示专门为哪种数据类型服务。
    * 但是Java虚拟机的操作码长度只有一个字节，这就带来一个问题，如果每种与数据类型相关的指令都支持Java虚拟机运行时数据类型的话，显然一个字节就不够用了。
    *  所以Java虚拟机规范中，这种特性"Not Orthogonal",并非每种数据类型和每一种操作都有对应的指令。 大部分的指令都没有支持byte、char、short,没有任何
    * 指令支持boolean类型。编译器在编译期或者运行期将byte和short类型的数据带符号扩展为相应的int类型数据，将boolean和char类型数据零位扩展为相应的int
    * 类型数据。与之类似的，**在处理byte、char、short和boolean类型的数组时，也会转换成对应的int类型的字节码指令来处理。**因此，大多数对于byte、char、
    * short和boolean类型数据的操作，实际上都是使用相应的int类型作为运算类型的。
    *
    * 2.变量的值不确定,在java中,变量的值只有在运行的时候才能被JVM知道, 在编译的时候是不确定的,所以两个变量相加后变量的值还是储存在变量中,这样编译器就
    * 没有办法判断这个值是否溢出,所以就会报错.
    * */

    private static void method1(){
        byte a=1,b=2,c,d;
        final byte e= 3,f = 4;
        c = e + f;
        /*
        * 下面的这行会报错误：  Error:(14, 15) java: 不兼容的类型: 从int转换到byte可能会有损失
        *
        * */
        //d = a + b;

        System.out.println(c);
//        System.out.println(d);
    }

    public static void main(String[] args) {
        method1();
    }

}

