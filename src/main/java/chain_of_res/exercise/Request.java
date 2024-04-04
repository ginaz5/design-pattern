package chain_of_res.exercise;

public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType type, double amount) {
        this.requestType = type;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
