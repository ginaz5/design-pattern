package chain_of_res.exercise;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE &&
            request.getAmount() <= 1500) {
                System.out.println("VP can approve purchase below 1500");
        } else {
            successor.handleRequest(request);
        }
    }
}
