package day26;

public class E03 {
    private String disease="Corona";
    private String ccn="1234567891011";
    private boolean old= false;
    public static void main(String[] args) {

        /*
        Create three variable which are disease, credit card number and old(boolean)
        Encapsulate them
        Make the disease readable not updateble
        Make the credit card number updateble not readable
        Make the old both readable and updatable
         */

    }

    public String getDisease(){
        return disease;
    }
    public void setCcn(String ccn){
        this.ccn=ccn;
    }

    public boolean isOld(){
        return old;
    }
    public void setOld(boolean old){
        this.old=old;
    }

}
