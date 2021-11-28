package SoPhuc;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public SoPhuc cong(SoPhuc o){
        return new SoPhuc(thuc + o.thuc, ao + o.ao);
    }
    public SoPhuc nhan(SoPhuc o){
        return new SoPhuc(thuc * o.thuc - ao * o.ao, thuc * o.ao + ao * o.thuc);
    }
    @Override
    public String toString(){
        if(ao >= 0) return thuc + " + " + ao + "i";
        return thuc + " - " + (-ao) + "i";
    }
}
