import java.util.HashMap;
import org.toolfactory.java.agreement.Action;
import org.toolfactory.java.agreement.ActionCallback;
import org.toolfactory.java.agreement.Agreement;
import org.toolfactory.java.agreement.Command;
import org.toolfactory.java.agreement.impl.GeneralAction;
import org.toolfactory.java.agreement.impl.GeneralCommand;

/**
 * Class represents a simple test of Agreement API with is the close implementation of Command Design Pattern
 * @author Arjun
 **/

public class AgreementTest {
    
    public static void main(String[] args) {
//        First prepare a Map of Command and Action
        HashMap<Command, Action>map=new HashMap<>();
        map.put(new GeneralCommand("general"), new GeneralAction());
        
//        Build Agreement 
        Agreement agreement=new Agreement(map);
        
//        Just execute below method with a Callback
        agreement.forCommand(new GeneralCommand("general")).executeAction(new ActionCallback<String, String,String>(){

            @Override
            public void onActionSuccess(String s) {
                System.out.println(s);
            }
                        
            @Override
            public void onActionFailed(String e) {
                System.out.println(e);
            }

            @Override
            public String getParams() {
                return "Hello Java Man";
            }            
        });
    }
    
}
