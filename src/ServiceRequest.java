public class ServiceRequest {
    private EMilitaryRank type;
    private String request = "";
    private String conclusion = "";

    public ServiceRequest(EMilitaryRank type, String request) {
        this.type = type;
        this.request = request;
    }

    public EMilitaryRank getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
