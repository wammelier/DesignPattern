package dogDoor;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Bark> allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("jThe dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setAllowedBark(List<Bark> bark) {
        this.allowedBark = bark;
    }

    public List<Bark> getAllowedBark() {
        return allowedBark;
    }

    public void addAllowedBark(Bark bark) {
        this.allowedBark.add(bark);
    }
}
