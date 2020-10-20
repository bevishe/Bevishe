package com.cqupt.threadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumThread implements Callable {

    private long start;
    private long end;

    public SumThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public synchronized Long call() throws Exception {
        long sum = 0L;
        for (long i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }
}


class SumTest{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int N = 10000000;
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long start1 = System.currentTimeMillis();
        List<Future<Long>> ans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Long> a = executorService.submit(new SumThread(i*N/10,(i+1)*N/10));
            ans.add(a);
        }
        long sum = 0;
        for (Future<Long> i : ans) {
            Long temp = i.get();
            System.out.println("线程"+i+" 的结果是： "+temp);
            sum += temp;

        }
        // 关闭线程池
        executorService.shutdown();
        long end1 = System.currentTimeMillis();
        System.out.println("并行计算耗时：" + (end1 - start1) + "ms");
        System.out.println("并行结算的结果"+sum);
    }
}