package remote;

/**
 * @author Ruoyu Chen
 * Created on 12/27/2018
 */
public class GarageDoorDownCommand {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
