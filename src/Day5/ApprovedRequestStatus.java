package Day5;

public class ApprovedRequestStatus implements RequestStatus{
    @Override
    public void approve(RequestContext context) {
        System.out.println("A Request can not be approved twice !");
    }

    @Override
    public void reject(RequestContext context) {
        System.out.println("Approved Request can not be rejected !");
    }

    @Override
    public void resubmit(RequestContext context) {
        System.out.println("Approved Request can not be resubmitted !");
    }
}
