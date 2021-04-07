package day32;

public class Interview {
    /*
        What is ther difference between "final" "finally" and "finalize()" ?

        1-final: We can use "final" keyword for a- variables ==> their values can not be updated
                                              b- method ==>the body of final methods is in its final state
                                                           It means you cannot update the body of the final method.
                                                           If you can not update the body, overriding is not meanful.
                                                           Because of that Java does not allow to override final methods
                                              c- class  ==> Final classes cannot be inherited. It means a final class
                                                            cannot be a parent class or a final class can not have child classes

        2- finally: this is a code block. We use after try catch block. IT runs under every condition.
                    For example, to cut connection with the cloud we can use finally code block

        3- finalize() : We can use finalize() method to make the unused objects ready to be destroyed by Garbage Collector
        When we call finalize() method it is not certain finalize() method will run(Java decides to run finalize() ).

     */

    public static void main(String[] args) {

    }
}
