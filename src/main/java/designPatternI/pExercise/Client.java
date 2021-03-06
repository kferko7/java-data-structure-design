package designPatternI.pExercise;

public class Client {
    public static void main(String[] args) {
        Base chain = new BasicAuthenticationHandler(
                new DigestAuthenticationHandler(
                        new ClientCertificateAuthenticationHandler(
                                null)));
        chain.handleRequest("basic");
        chain.handleRequest("digest");
        chain.handleRequest("client certificate");
    }

}

