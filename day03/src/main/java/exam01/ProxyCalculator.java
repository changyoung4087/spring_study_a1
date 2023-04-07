package exam01;

public class ProxyCalculator implements Calculator {

    private Calculator calculator;
    /** 다형성으로 의존성주입 */
    public ProxyCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    /** Proxy 대신수행 */
    @Override
    public long factorial(long num) {
        long startTime = System.nanoTime(); // 시간을 나노로 측정

        long result = calculator.factorial(num); // 핵심기능 대신수행

        long endTime = System.nanoTime(); // 시간을 나노로 측정
        System.out.printf("팩토리얼 걸린시간 : %d%n", endTime - startTime);

        return result;
    }
}
