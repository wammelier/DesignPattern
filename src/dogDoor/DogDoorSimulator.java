package dogDoor;

public class DogDoorSimulator {

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("\nFido starts barking....");
        recognizer.recognize("Woof");

        System.out.println("\nFido has gone outside");

        System.out.println("\nFido's all done... ");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e ) { }

        System.out.println("...but he's stuck outside!");

        // 강아지 소리를 듣는 하드웨어를 다시 시뮬레이션
        System.out.println("\nFido starts barking....");
        recognizer.recognize("Woof");

        System.out.println("\nFIdo's back inside...");
    }
}
