public class InstaAccount {
    private String username;
    String displayName;
    private String bio;
    private int followers;
    private int following;
    private boolean privateProfile;

    public InstaAccount(String username, String displayName, String bio) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username is required.");
        }
        this.username = username;
        setDisplayName(displayName);
        setBio(bio);
        followers = 0;
        following = 0;
        privateProfile = false;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getBio() {
        return bio;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public boolean isPrivateProfile() {
        return privateProfile;
    }

    public void setDisplayName(String displayName) {
        if (displayName == null || displayName.trim().length() < 3) {
            System.out.println("Display name must be at least 3 characters long.");
            return;
        }
        this.displayName = displayName.trim();
    }

    public void setBio(String bio) {
        if (bio == null || bio.length() > 150) {
            System.out.println("Bio cannot exceed 150 characters.");
            return;
        }
        this.bio = bio;
    }

    public void setPrivate(boolean value) {
        if (value == privateProfile) {
            System.out.println("Profile is already " + (value ? "private." : "public."));
            return;
        }
        privateProfile = value;
    }

    public void followAccount(String account) {
        if (account == null || account.isBlank()) {
            System.out.println("Account name cannot be blank.");
            return;
        }
        if (account.equalsIgnoreCase(username)) {
            System.out.println("You cannot follow yourself.");
            return;
        }
        following++;
        System.out.println(username + " is now following " + account);
    }

    public void display() {
        System.out.println("username = " + getUsername());
        System.out.println("displayName = " + getDisplayName());
        System.out.println("bio = " + getBio());
        System.out.println("followers = " + getFollowers());
        System.out.println("following = " + getFollowing());
        System.out.println("private = " + isPrivateProfile());
    }
}