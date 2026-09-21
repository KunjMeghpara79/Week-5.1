package Day5;

public class PendingRequestStatus implements RequestStatus{
    @Override
    public void approve(RequestContext context) {
        System.out.println("Request Approved !");
        context.setStatus(new ApprovedRequestStatus());
    }

    @Override
    public void reject(RequestContext context) {
        System.out.println("Request Rejected !");
        context.setStatus(new RejectedRequestStatus());
    }

    @Override
    public void resubmit(RequestContext context) {
        System.out.println("Only Rejected request can be resubmitted !");
    }
}
