package designPattern;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public abstract class Duck {

    FlyBehavior flyBegavior;
    QuackBehavior quackBehavior;

    public abstract void display();
    
    public void setFlyBegavior(FlyBehavior fb) {
        flyBegavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performFly() {
        flyBegavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠~");
    }

}
