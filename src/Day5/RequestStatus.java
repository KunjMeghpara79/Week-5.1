package Day5;

public interface RequestStatus {
    void approve(RequestContext context);
    void reject(RequestContext context);
    void resubmit(RequestContext context);

}
