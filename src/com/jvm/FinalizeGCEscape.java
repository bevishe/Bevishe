package com.jvm;

/**
 * @Classname FinalizeGCEscape
 * @Description TODO
 * @Date 2020/3/4 11:19
 * @Created by Administrator
 */
public class FinalizeGCEscape {

    /*
    * 程序主要验证了在jvm中，对象的回收是需要两次标记，同时同一个对象只可以执行一个次finalize
    * */
    public static FinalizeGCEscape SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("i am alive!");
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize is start!");
        FinalizeGCEscape.SAVE_HOOK = this;
//        FinalizeGCEscape.SAVE_HOOK = this;
        // 为什么将后面的new FinalizeGCEscape改为this就会一次成功后面一次失败呢。
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeGCEscape();
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("i am dead!");
        }


        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("i am dead!");
        }
    }
}