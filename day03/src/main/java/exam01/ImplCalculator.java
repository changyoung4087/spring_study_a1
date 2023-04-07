package exam01;

public class ImplCalculator implements Calculator {

    /**반복문 팩토리얼*/
    public long factorial(long num) {
//        long startTime = System.nanoTime(); // 시간을 나노로 측정
        int total = 1;
        for(int i = 1; i <= num; i ++){
            total *= i;
        }
//        long endTime = System.nanoTime(); // 시간을 나노로 측정
//        System.out.printf("반복 팩토리얼 걸린시간 : %d%n", endTime - startTime);
        return total;
    }
}

