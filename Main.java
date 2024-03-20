//Bank_System

// Bank System is a simple program which implements a OOP Concept : Polymorphism
public class Main {
    public static void main(String[] args) {

        //constructing Objects
        ICICI icici = new ICICI();
        icici.details("ICICI", "Ahemadabad"); //compile time polymorphism call
        YES yes = new YES();
        yes.details("YES", 8000);  //compile time polymorphism call
        IDBI idbi = new IDBI();
        idbi.details("IDBI", 7000, 1000000);  //compile time polymorphism call
        SBI sbi = new SBI();
        sbi.details("SBI", "Ahemadabad", 4000);  //compile time polymorphism call

        Bank bank;

        bank = new ICICI();
        System.out.println("Interest Of ICICI : " + bank.getRateofIntrest()); //Run time polymorphism call
        bank = new YES();
        System.out.println("Interest Of YES : " + bank.getRateofIntrest()); //Run time polymorphism call
        bank = new IDBI();
        System.out.println("Interest Of IDBI : " + bank.getRateofIntrest()); //Run time polymorphism call
        bank = new SBI();
        System.out.println("Interest Of SBI : " + bank.getRateofIntrest());  //Run time polymorphism call
    }
}

// parent class Bank
// I have to use concept of inheritance for run time polymorphism
class Bank {

    // getrateofintrest function is used for giving intrest of bank which returns float value (interest)
    float getRateofIntrest() {
        return 0;
    }
}

// Child Class of bank
// ICICI class implements two function getrateofintrest and details
class ICICI extends Bank {

    // getrateofintrest is a runtime ploymorphism function which returns float value
    float getRateofIntrest() {
        return 5.3f;
    }

    /*details is a compiled time polymorphism function
    which take two parameter name and address and prints details
    about bank.
     */
    void details(String name, String address) {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println();
    }
}

// Child Class of bank
class YES extends Bank {

    // getrateofintrest is a runtime ploymorphism function which returns float value
    float getRateofIntrest() {
        return 4.7f;
    }

    /*details is a compiled time polymorphism function
   which take two parameter name and no of employee and
   prints details about bank.
    */
    void details(String name, int no_of_employee) {
        System.out.println("Name : " + name);
        System.out.println("No of Employees : " + no_of_employee);
        System.out.println();
    }
}

// Child Class of bank
class IDBI extends Bank {

    // getrateofintrest is a runtime ploymorphism function which returns float value
    float getRateofIntrest() {
        return 5.2f;
    }

    /*details is a compiled time polymorphism function
   which take three parameter name , no of employee and maximum
   salary prints details about bank.
    */
    void details(String name, int no_of_employee, int max_salary) {
        System.out.println("Name : " + name);
        System.out.println("No of Employees : " + no_of_employee);
        System.out.println("Salary Upto : " + max_salary);
        System.out.println();
    }

}

// Child Class of bank
class SBI extends Bank {

    // getrateofintrest is a runtime ploymorphism function which returns float value
    float getRateofIntrest() {
        return 8.3f;
    }

    /*details is a compiled time polymorphism function
  which take three parameter name , address and no of branch
  prints details about bank.
   */
    void details(String name, String address, int no_of_branch) {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("No of Branch : " + no_of_branch);
        System.out.println();
    }
}

