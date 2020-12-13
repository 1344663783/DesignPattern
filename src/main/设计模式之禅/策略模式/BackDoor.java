package 设计模式之禅.策略模式;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国帮忙，让吴国给孙国太施加压力");
    }
}
