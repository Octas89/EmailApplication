import java.util.Scanner;

public class Email {
    //Identify and create variables
    private String firstName;
    private String lastName;
    private String password;
    private int passLength=10;
    private String department;
    private String email;
    private int mailBoxCapacity;
    private String alternateEmail;

    //define constructor to receive first name and last name
    public Email(){
        System.out.print("Please enter your first name: ");
        Scanner in=new Scanner(System.in);
        this.firstName=in.next();
        System.out.print("Please enter your last name: ");
        this.lastName=in.next();
        //call a method to ask for department and return department
        this.department=askDepartment();
        //call method to generate password
        this.password=generatePass(this.passLength);
        //combine elements to generate email
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+".company.com";
        showInfo();

    }

    //ask for department method
    private String askDepartment() {
        System.out.print("Department Codes:\n1-Sales\n2-Development\n3-Accounting\n0-none\nPlease enter department code:");
        Scanner scan = new Scanner(System.in);
        int depart = scan.nextInt();
        if (depart == 1) {
            return "sales";
        } else if (depart == 2) {
            return "dev";
        } else if (depart == 3) {
            return "account";
        } else {
            return "";
        }
    }
    //generate a random password
    private String generatePass(int passLength){
        String setPass="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&?!";
        char [] password=new char[passLength];
        for(int i=0;i<passLength;i++){
            int rand=(int)(Math.random()*setPass.length());
            password[i]=setPass.charAt(rand);
        }
        return new String(password);
    }
    //set the mailbox capacity
    public void setMailBoxCapacity(int mailBoxCapacity){
        this.mailBoxCapacity=mailBoxCapacity;
    }
    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    //change the password
    public void changePass(String newPass){
        this.password=newPass;
    }
    //get the mailbox capacity
    public int getMailBoxCapacity(){return mailBoxCapacity;}
    //get the alternate email
    public String getAlternateEmail(){return alternateEmail;}
    //get password
    public String getPassword(){return password;}
    //show info
    public void showInfo(){
        System.out.println("Your name is: "+firstName+" "+lastName);
        System.out.println("Your email is: "+email);
        System.out.println("Your password is: "+getPassword());
    }

}
