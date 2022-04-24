package designPatternI.pExercise;

public class BasicAuthenticationHandler extends Base {
    //I've got a constructor and this takes an Authentication Handler
    //And then it calls super and passes this handler
    public BasicAuthenticationHandler(Base next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("basic")) {
            System.out.println("Handling basic authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }

}

