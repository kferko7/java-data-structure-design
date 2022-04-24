package designPatternI.pExercise;

public class DigestAuthenticationHandler extends Base {

    public DigestAuthenticationHandler(Base next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("digest")) {
            System.out.println("Handling digest authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }

}
