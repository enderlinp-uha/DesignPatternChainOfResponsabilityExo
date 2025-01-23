public class Soldat implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == EMilitaryRank.SOLDAT) {
            request.setConclusion("Soldat cleaned the barracks !");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                request.setConclusion("Soldat could not clean the barracks !");
            }
        }
    }
}
