public class Caporal implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == EMilitaryRank.CAPORAL) {
            request.setConclusion("Caporal send order to soldat !");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}
