public class Main {
    public static void main(String[] args) {
        ISupportService general = new General();
        ISupportService sergent = new Sergent();
        ISupportService caporal = new Caporal();
        ISupportService soldat = new Soldat();

        general.setNext(sergent);
        sergent.setNext(caporal);
        caporal.setNext(soldat);

        ServiceRequest requestA = new ServiceRequest(EMilitaryRank.GENERAL, "Lorem");
        ServiceRequest requestB = new ServiceRequest(EMilitaryRank.SERGENT, "Ipsum");
        ServiceRequest requestC = new ServiceRequest(EMilitaryRank.CAPORAL, "Dolor");
        ServiceRequest requestD = new ServiceRequest(EMilitaryRank.SOLDAT, "Sit Amet");

        general.handleRequest(requestA);
        general.handleRequest(requestB);
        general.handleRequest(requestC);
        general.handleRequest(requestD);

        System.out.println(requestA.getConclusion());
        System.out.println(requestB.getConclusion());
        System.out.println(requestC.getConclusion());
        System.out.println(requestD.getConclusion());
    }
}