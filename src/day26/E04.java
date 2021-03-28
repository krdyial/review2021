package day26;

public class E04 {
    private String disease="Corona";
    private String ccn="1234567891011";



    private boolean old= false ;
    public static void main(String[] args) {

        /*
        Create three variable which are disease, credit card number and old(boolean)
        Encapsulate them
        Make the disease readable not updateble
        Make the credit card number updateble not readable
        Make the old both readable and updatable
         */
    }
    // in this class I used automatically generator and it adds getters and setter methods automatically

    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public String getDisease() {
        return disease;
    }

    public boolean isOld() { // for getter method we must use for booleans not get in method
                             // type in stead of "get" "is"
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    /*
    NOTE: if you do not want any data to be updatable DO NOT create SETTERS
    If all data of a class are encapsulated and no setter method is created
    then the class is called "IMMUTABLE CLASS"

     */
}
