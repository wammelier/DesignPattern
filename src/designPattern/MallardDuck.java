package designPattern;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBegavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
