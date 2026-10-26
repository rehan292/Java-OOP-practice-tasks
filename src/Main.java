import instagramlab.InstaAccount;

public class Main{
    public static void main(String[] args){

        InstaAccount account1 = new InstaAccount("@sara.cs","sara", "hey i am sara ", new int[]{20,30,40});
        account1.displayDetails();

        InstaAccount account2 = new InstaAccount("@areeba.cs","areeba", "hey i am areeba" , new int[]{40,50,60});
        account2.displayDetails();

    }
}