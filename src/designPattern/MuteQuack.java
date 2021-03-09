package designPattern;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("아무소리도 나지 않음..");
    }
}
