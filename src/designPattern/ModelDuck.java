package designPattern;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBegavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형 오리입니다");
    }


}
