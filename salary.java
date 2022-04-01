import java.util.Scanner;

class Employee {
    int empid;
    long mobile_num;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter name of the employee:");
        name = get.nextLine();
        System.out.println("Enter E-mail ID:");
        mailid = get.nextLine();
        System.out.println("Enter the address of the employee:");
        address = get.nextLine();
        System.out.println("Enter Employee ID:");
        empid = get.nextInt();
        System.out.println("Enter mobile number of the employee:");
        mobile_num = get.nextLong();
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee E-mail ID: " + mailid);
        System.out.println("Employee Mobile number: " + mobile_num);
    }

}

class Programmer extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getprogrammer() {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }

    void calculateprog() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("PAYSLIP OF THE PROGRAMMER:");
        System.out.println("Basic pay: Rs." + bp);
        System.out.println("DA: Rs." + da);
        System.out.println("HRA: Rs." + hra);
        System.out.println("PF: Rs." + pf);
        System.out.println("Club: Rs." + club);
        System.out.println("Gross salary: Rs." + gross);
        System.out.println("Net Salary earned: Rs." + net);
    }
}

class Asstprofessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getasst() {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }

    void calculateasst() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("PAYSLIP OF THE PROGRAMMER:");
        System.out.println("Basic pay: Rs." + bp);
        System.out.println("DA: Rs." + da);
        System.out.println("HRA: Rs." + hra);
        System.out.println("PF: Rs." + pf);
        System.out.println("Club: Rs." + club);
        System.out.println("Gross salary: Rs." + gross);
        System.out.println("Net Salary earned: Rs." + net);
    }
}

class Associateprofessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getassociate() {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }

    void calculateassociate() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("PAYSLIP OF THE PROGRAMMER:");
        System.out.println("Basic pay: Rs." + bp);
        System.out.println("DA: Rs." + da);
        System.out.println("HRA: Rs." + hra);
        System.out.println("PF: Rs." + pf);
        System.out.println("Club: Rs." + club);
        System.out.println("Gross salary: Rs." + gross);
        System.out.println("Net Salary earned: Rs." + net);
    }
}

class Professor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getprofessor() {
        System.out.println("Enter basic pay:");
        bp = get.nextDouble();
    }

    void calculateprofessor() {
        da = (0.97 * bp);
        hra = (0.10 * bp);
        pf = (0.12 * bp);
        club = (0.1 * bp);
        gross = (bp + da + hra);
        net = (gross - pf - club);
        System.out.println("PAYSLIP OF THE PROGRAMMER:");
        System.out.println("Basic pay: Rs." + bp);
        System.out.println("DA: Rs." + da);
        System.out.println("HRA: Rs." + hra);
        System.out.println("PF: Rs." + pf);
        System.out.println("Club: Rs." + club);
        System.out.println("Gross salary: Rs." + gross);
        System.out.println("Net Salary earned: Rs." + net);
    }
}

public class Salary {
    public static void main(String args[]) {
        int choice, cont;
        do {
            System.out.println("PAYROLL");
            System.out.println("1. PROGRAMMER\n2.ASSISTANT\n3.ASSOCIATE PROFESOR\n4.PROFESSOR");
            Scanner c = new Scanner(System.in);
            System.out.println("Enter your choice");
            choice = c.nextInt();
            switch (choice) {
                case 1: {
                    Programmer p = new Programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                    break;
                }

                case 2: {
                    Asstprofessor asst = new Asstprofessor();
                    asst.getdata();
                    asst.getasst();
                    asst.display();
                    asst.calculateasst();
                    break;
                }

                case 3:

                {
                    Associateprofessor asso = new Associateprofessor();
                    asso.getdata();
                    asso.getassociate();
                    asso.display();
                    asso.calculateassociate();
                    break;
                }

                case 4:

                    Professor prof = new Professor();
                    prof.getdata();
                    prof.getprofessor();
                    prof.display();
                    prof.calculateprofessor();
                    break;
            }
            System.out.println("Enter 0 to quit and 1 to continue:");
            cont = c.nextInt();
            c.close();
        } while (cont == 1);

    }

}
