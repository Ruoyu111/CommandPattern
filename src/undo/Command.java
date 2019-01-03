package undo;

/**
 * @author Ruoyu Chen
 * Created on 12/27/2018
 */
public interface Command {
    public void execute();
    public void undo();
}
