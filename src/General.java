public class General implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == EMilitaryRank.GENERAL) {
            request.setConclusion("General send order to Sergent !");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
