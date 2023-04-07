package exam01;

import exam01.Calculator;
import exam01.ImplCalculator;
import exam01.ProxyCalculator;

public class Ex02 {
    public static void main(String[] args){
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());
        ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());

        long result1 = cal1.factorial(10);
        System.out.println("일반방식의 팩토리얼 : " + result1);
        long result2 = cal2.factorial(10);
        System.out.println("재귀방식의 팩토리얼 : " + result2);
    }
}
