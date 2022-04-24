package designPatternI.pExercise;

public class ClientCertificateAuthenticationHandler extends Base {

    public ClientCertificateAuthenticationHandler(Base next) {
        super(next);
    }

    public void handleRequest(String requestType) {
        if(requestType.equals("client certificate")) {
            System.out.println("Handling client certificate authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }

}