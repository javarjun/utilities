package org.toolfactory.java.agreement;

import java.util.HashMap;

/**
 *
 * @author Arjun
 */
public class Agreement {
    
    private HashMap<Command,Action> map=null;
    
    private Command command;
            
    public Agreement(HashMap<Command,Action> map) {
        this.map=map;
    }
    
    public Agreement forCommand(Command command){
        this.command=command;
        return this;
    }      
    
    public void executeAction(ActionCallback actionResponse) throws IllegalStateException{
        if(map==null || map.isEmpty())
            throw new IllegalStateException("Agreement Not Set");
        if(command==null)
            throw new IllegalStateException("No Command Provided");
        Action action=map.get(command);
        if(action==null)
            throw new IllegalStateException("No Action associated with provided Command");
        action.execute(actionResponse);
    }
}
