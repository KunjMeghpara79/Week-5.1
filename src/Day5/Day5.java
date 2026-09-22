package Day5;

public class Day5 {
    public static void main(String[] args) {
        RequestContext context = new RequestContext();
        context.getRequestStatus().reject(context);
        context.getRequestStatus().resubmit(context);
    }
}
