package bscc.refactoringpatterns;

import java.util.HashMap;
import java.util.Map;

public class CommandVsSwitch {
    enum MessageType {
        PLACE_ORDER(PlaceOrderCommand.class),
        CANCEL_ORDER(CancelOrderCommand.class);

        public final Class<? extends Command> commandClass;
        MessageType(Class<? extends Command> commandClass) {
            this.commandClass = commandClass;
        }
    }
    private final static Map<String, Command> commandMap = new HashMap<>();

    static {
        commandMap.put("PLACE_ORDER", new PlaceOrderCommand());
        commandMap.put("CANCEL_ORDER", new CancelOrderCommand());
    }

    public static void main(String[] args) {
        String actionType = "PLACE_ORDER";
//        switch (actionType) {
//            case "PLACE_ORDER" : // logica multa 1
//                break;
//            case "CANCEL_ORDER" : // logica multa 2
//                break;
//        }
        commandMap.get(actionType).execute();

        commandMap.getOrDefault(actionType,
                () -> {
                    throw new IllegalArgumentException(actionType);
                })
                .execute();

        MessageType messageType = MessageType.valueOf(actionType);

//        applicationContext.getBean(messageType.commandClass).execute();
    }
}
interface Command {
    void execute();
}
class PlaceOrderCommand implements Command {
    public void execute () {
        // logica multa 1
    }
}

class CancelOrderCommand implements Command{
    public void execute () {
        // logica multa 2
    }
}
