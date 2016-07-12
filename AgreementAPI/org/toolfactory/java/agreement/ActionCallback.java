package org.toolfactory.java.agreement;

/**
 * An Action to be performed on the basis of a Command
 *  S represents the object forwarded to caller when Action succeeds
 *  E represents the object forwarded to caller when Action fails
 *  P represents the object forwarded to caller when there is any error while executing Action
 * 
 *  @author Arjun
 *  
 */
public interface ActionCallback<S,E,P> {
    void onActionSuccess(S s);
    P getParams();
    void onActionFailed(E e);
}
