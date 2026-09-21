package Day5;

public class RejectedRequestStatus implements RequestStatus{
    @Override
    public void approve(RequestContext context) {
        System.out.println("Rejected request can not be approved !");
    }

    @Override
    public void reject(RequestContext context) {
        System.out.println("A request can not be rejected twice !");
    }

    @Override
    public void resubmit(RequestContext context) {
        System.out.println("Request Resubmitted ! ");
        context.setStatus(new PendingRequestStatus());
    }
}
