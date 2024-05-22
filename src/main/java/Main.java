public class Main {
    public static void main(String[] args) {
        SocialHandle handle = new SocialHandle("");
        System.out.println(handle.createHandle());
        System.out.println(handle.checkHandleLessThan9Characters());
        System.out.println(handle.checkIfHandleNull());
        System.out.println(handle.checkEmptyOrBlankCharacters());

    }
}
