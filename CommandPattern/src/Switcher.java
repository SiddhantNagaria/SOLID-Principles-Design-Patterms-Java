import java.util.ArrayList;
import java.util.List;

public class Switcher {

    public final List<Command> commands;

    public  Switcher(){
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void executeCommand(){
        for(Command command: this.commands){
            command.execute();
        }
    }
}
