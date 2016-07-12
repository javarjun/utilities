package org.toolfactory.java.agreement.impl;

import org.toolfactory.java.agreement.Action;
import org.toolfactory.java.agreement.ActionCallback;

public class GeneralAction implements Action<String, String, String>{

    @Override
    public void execute(ActionCallback<String, String,String> actionCallback) {
        if(actionCallback!=null)
           actionCallback.onActionSuccess("General Action Success params="+actionCallback.getParams());
    }
    
}
