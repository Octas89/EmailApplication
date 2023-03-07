public class Main {
    public static void main(String[] args) {

        Email em1=new Email();
        em1.setAlternateEmail("example@gmail.com");
        em1.setMailBoxCapacity(400);
        em1.changePass("Test123");
        System.out.println("Your mailbox capacity is :"+em1.getMailBoxCapacity());
        System.out.println("Your alternate email is "+em1.getAlternateEmail());
        System.out.println("Your new email is "+em1.getPassword());


    }
}