package org.toolfactory.java.agreement;

/**
 * An Action to be performed on the basis of a Command<br/>
 *   S represents the object forwarded to caller when Action succeeds<br/>
 *   E represents the object forwarded to caller when Action fails<br/>
 *   P represents the object to be transfered as a parameter to Action<br/>
 *  @author Arjun
 */
public interface Action<S,E,P> {
    void execute(ActionCallback<S,E,P> actionResponse);
}
