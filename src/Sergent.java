public class Sergent implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == EMilitaryRank.SERGENT) {
            request.setConclusion("Sergent send order to Caporal !");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
