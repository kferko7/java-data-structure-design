package designPatternI.pExercise;

public abstract class Base {

    private Base next;

    public Base(Base next) {
        this.next = next;
    }

    public void handleRequest(String requestType) {
        //Condition to check if it is null and if it's not handle Request
        if(next != null) {
            next.handleRequest(requestType);
        }
    }

}
/**
 1.When might you consider using the Chain of Responsibility pattern?
 -You want to avoid coupling the sender of a request to its receiver.
 -This pattern is useful when you need to make a request, but won't know until runtime which object will handle it.
 * */