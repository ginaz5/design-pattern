package chain_of_res.exercise;

import chain_of_res.exercise.Request;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);

    }

}
