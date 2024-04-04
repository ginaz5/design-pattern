package chain_of_res.exercise;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve all requests");
    }
}
