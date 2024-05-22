import java.util.List;
import java.util.Random;

public class SocialHandle {
    //Creates a social media handle with a max of 9 characters
    //Should be able to accept as many characters as possible
    //All social media handles must end up being lowercase
    //Attach an @ to make the 10th character
    //Cannot be blank or null
    //Account for exceptions
    private int id;
    private String socialHandle;
    private int uniqueId = 0;


    public SocialHandle(String socialHandle) {
        uniqueId++;
        this.id = uniqueId;
        this.socialHandle = socialHandle;
    }

    public String createHandle(){
        if (!socialHandle.isBlank()) {
            socialHandle = "@".concat(socialHandle.toLowerCase().substring(0, 9));
            return socialHandle;
        } else{
                Random rand = new Random();
                int randomUser = rand.nextInt(100000);
                String randomUserString = "@user";
                String numAddon = Integer.toString(randomUser);
                socialHandle = randomUserString.concat(numAddon);
            return socialHandle;
        }
    }

    public boolean checkHandleLessThan9Characters(){
        if(socialHandle.length() < 10){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfHandleNull(){
        if (socialHandle == null){
            return true;
        } else{
            return false;
        }
    }

    public boolean checkEmptyOrBlankCharacters(){
        if(socialHandle.trim().isEmpty()){
            if(socialHandle.trim().length() < 10) {
                return true;
            }
        }
        return false;
    }

    public String displayHandle(){
        return socialHandle;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSocialHandle() {
        return socialHandle;
    }

    public void setSocialHandle(String socialHandle) {
        this.socialHandle = socialHandle;
    }
}
