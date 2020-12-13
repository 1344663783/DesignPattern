package 设计模式之禅.策略模式;

public class Context {
    //构造函数，你要使用那个妙计
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋出招
    public void operate(){
        this.strategy.operate();
    }
}
