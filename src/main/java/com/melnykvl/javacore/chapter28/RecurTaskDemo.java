package main.java.com.melnykvl.javacore.chapter28;

import java.util.concurrent.*;

class Sum extends RecursiveTask<Double> {

    final int seqThresHold = 500;
    double[] data;
    int start, end;

    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    @Override
    protected Double compute() {

        double sum = 0;

        if ((end - start) < seqThresHold)
            for (int i = start; i < end; i++)
                sum += data[i];
        else {
            int middle = (start + end) / 2;

            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            subTaskA.

            sum = subTaskA.join() + subTaskB.join();

        }

        return sum;

    }
}

public class RecurTaskDemo {
    public static void main(String[] args) {

        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums=  new double[];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i%2) == 0) ? i : -i);

        Sum task = new Sum(nums, 0, nums.length);

        double summation = fjp.invoke(task);

        System.out.println("Суммирование " + summation);

    }
}
