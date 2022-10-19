public class Main {
    public static void main(String[] args) {
        String userPattern = "^[_a-z0-9]{6,}$";
        String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com","chinxo12" };
        for (String email : validEmail) {
            boolean isvalid = email.matches(userPattern);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = email.matches(userPattern);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}