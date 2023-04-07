package exam01;

import exam01.ImplCalculator;

public class Ex01 {
    public static void main(String[] args){
        /*long startTime = System.nanoTime(); // 시간을 나노로 측정*/

        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10);
        System.out.printf("cal1 = %d%n", result1);

        /*long endTime = System.nanoTime(); // 시간을 나노로 측정
        System.out.printf("반복 팩토리얼 걸린시간 : %d%n", endTime - startTime);*/

        /*long startTime2 = System.nanoTime(); // 시간을 나노로 측정*/

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);
        System.out.printf("cal2 = %d%n", result2);

        /*long endTime2 = System.nanoTime(); // 시간을 나노로 측정
        System.out.printf("재귀적 방식의 팩토리얼 걸린시간 : %d%n", endTime2 - startTime2);*/
    }
}
