import java.util.List;

public class UserBase {
    private SocialHandle[] listOfHandles;
    private int numberOfUsers;

    public UserBase(SocialHandle[] listOfHandles) {
        this.listOfHandles = listOfHandles;
        this.numberOfUsers = listOfHandles.length;
    }

    public void addHandle(SocialHandle handle) {
        if (numberOfUsers < listOfHandles.length) {
            listOfHandles[numberOfUsers] = handle;
            numberOfUsers++;
        } else {
            System.out.println("Empty UserBase");
        }
    }
}