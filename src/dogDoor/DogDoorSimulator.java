package dogDoor;

public class DogDoorSimulator {

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        // 하드웨어가 강아지 소리를 듣는 것을 시뮬레이션한다.
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("\nBruce has gone outside...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {

        }
        System.out.println("\nBruce's all done....");
        System.out.println("...but he's stuck outside!");

        //하드웨어가 강아지 소리를 듣는 것을 다시 시뮬레이션 한다.
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);

        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e ) { }

        // 하드웨어가 강아지 소리를 듣는 것을 시뮬레이션 한다.
        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("roooowlf"));

        System.out.println("\nBruce's back inside....");
    }
}
