public class Main {
    public static void main(String[] args) {
        InstaAccount account = new InstaAccount("@sara.cs", "Sara", "Hello I am Sara");

        System.out.println("Username: " + account.getUsername());
        System.out.println("Name: " + account.getDisplayName());
        System.out.println("Bio: " + account.getBio());
        System.out.println();

        account.setDisplayName("Sara Khan");
        account.setBio("CS student at UCP");
        account.followAccount("@ucp.official");
        account.setPrivate(true);
        account.display();
        System.out.println();

        account.setBio(null);
        account.setDisplayName("Al");
        account.followAccount("@sara.cs");
    }
}