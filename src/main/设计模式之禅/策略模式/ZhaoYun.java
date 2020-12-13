package 设计模式之禅.策略模式;

/**
 * 赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---------刚到吴国拆第一个-------");
        context = new Context(new BackDoor()); //拿到妙计
        context.operate(); //拆开执行

        //刘备乐不思蜀，拆第二个
        System.out.println("-------刘备乐不思蜀，拆第二个-----");
        context = new Context(new GivenGreenLight());
        context.operate();//执行第二个妙计

        //孙权追兵，拆第三个
        System.out.println("-------孙权追兵，拆第三个------");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵

    }
}
