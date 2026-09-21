package Day5;

public class EscalatedRequestStatus implements RequestStatus{
    @Override
    public void approve(RequestContext context) {
        System.out.println("The Escalated request has been approved !");
        context.setStatus(new ApprovedRequestStatus());
    }

    @Override
    public void reject(RequestContext context) {
        System.out.println("The Escalated request has been rejected !");
        context.setStatus(new RejectedRequestStatus());
    }

    @Override
    public void resubmit(RequestContext context) {
        System.out.println("Only Rejected request can be resubmitted !");
    }
}
