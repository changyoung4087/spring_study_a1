package exam2;

public class Message {

    public void init() {
        System.out.println("init!");
    }
    public void send(String msg) {
        System.out.printf("전송 메세지 : %s%n", msg);
    }
    public void close(){
        System.out.println("close");
    }
}
