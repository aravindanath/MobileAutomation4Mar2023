package day4;

public class ExmpleTxn {

    public static void main(String[] args) {

        Txn txn = new Txn();
        txn.setCvv(122);
        txn.setName("Arvind");
        txn.setCc(344523452345l);
        txn.setExp(33);

        System.out.println(txn.getCc());
        System.out.println(txn.getCvv());
        System.out.println(txn.getName());
        System.out.println(txn.getExp());
    }
}
