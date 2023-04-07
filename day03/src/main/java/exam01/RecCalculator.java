package exam01;

import exam01.Calculator;

public class RecCalculator implements Calculator {

    /**재귀적 방식의 팩토리얼*/
    public long factorial(long num) {
//        long startTime = System.nanoTime(); // 시간을 나노로 측정
//        try{
            if(num == 0) {
                return 1;
            }

            return num * factorial(num - 1);
//        } finally {
//            long endTime = System.nanoTime(); // 시간을 나노로 측정
//            System.out.printf("재귀적 방식의 팩토리얼 걸린시간 : %d%n", endTime - startTime);
//        }
    }
}
