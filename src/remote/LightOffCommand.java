package remote;

/**
 * @author Ruoyu Chen
 * Created on 12/27/2018
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
