package remote;

/**
 * @author Ruoyu Chen
 * Created on 12/27/2018
 */
public class GarageDoorUpCommand {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
