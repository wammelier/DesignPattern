package designPattern;

import java.lang.reflect.MalformedParameterizedTypeException;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBegavior(new FlyRocketPowered());
        model.performFly();
    }
}
