package Day5;

public class RequestContext {
    private RequestStatus requestStatus;

    public RequestContext(){
        this.requestStatus = new PendingRequestStatus();
    }

    public void setStatus(RequestStatus requestStatus){
        this.requestStatus = requestStatus;
    }
}
