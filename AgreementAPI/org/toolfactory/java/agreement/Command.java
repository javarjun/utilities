package org.toolfactory.java.agreement;

public abstract class Command<T> {
    
    private T t;

    public Command(T t) {
        this.t = t;
    }        
    
    public T getCommand(){
        return t;
    };
    
    @Override
    public int hashCode() {
        return getCommand().hashCode();
    }        

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Command))
            return false;
        return getCommand().equals(((Command)obj).getCommand());
    }
}
