package com.cqupt.threadState;

public class Producer extends Thread{
    private BaoZi baoZi;

    public Producer( BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
            synchronized (baoZi){
                if(baoZi.isState()){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    baoZi.setState(true);
                }
                // 被唤醒之后执行的代码，交替执行生产包子
                if(count%2 == 0){
                    baoZi.setPi("薄皮");
                    baoZi.setXian("三鲜");
                }else{
                    baoZi.setPi("厚皮");
                    baoZi.setXian("牛肉");
                }

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.setState(true);
                count ++;
                baoZi.notify();
                System.out.println("包子铺已经生产好了"+baoZi.getPi()+baoZi.getXian()+"包子");
            }
        }
    }
}
