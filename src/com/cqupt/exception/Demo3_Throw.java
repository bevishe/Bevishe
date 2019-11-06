package com.cqupt.exception;

public class Demo3_Throw {
    /**
     * throw关键字
     * 作用：
     *  可以使用throw关键字，在指定的方法中抛出指定的异常
     * 使用格式：
     *      throw new xxxException("异常产生的原因“);
     * 注意：
     *      1.throw关键字必须写在方法的内部
     *      2.throw关键字后面new的对象必须是Exception或者是Exception的子类
     *      3.throw关键字抛出指定的异常对象，我们必须去处理这个异常对象
     *          throw关键字后边创建的是RuntimeException或者是RumtimeException的子类对象，我们可以不做处理，默认交给jvm处理
     *          throw关键字后边创建的是编译异常，我们必须处理这个异常要么throws 要么try catch
     *  注意：
     *      1.NullPointerException是一个运行期异常，可以不用处理，默认给jvm处理
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int e = getElement(arr,4);
        System.out.println(e);


    }

    public static int getElement(int[] arr,int index){
        /*
        * 可以对传递过来的数组进行合法性校验
        * 如果数组arr的值是null，那么我们抛出空指针异常，告知方法的调用者传递的数组的值是null
        *
        * */
        if(arr == null){
            throw new NullPointerException("传递的数组是空！");
        }
        if(index<0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的范围");
        }
        int ele = arr[index];
        return ele;
    }


}
