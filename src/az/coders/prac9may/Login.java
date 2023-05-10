package az.coders.prac9may;

import java.util.Random;

public class Login extends User{
    private String username;
    private String password;


    public Login loginGenerator(User user){
        Login l = new Login();
        l.username='@'+user.getName().toLowerCase()+user.getSurname().toLowerCase();
        l.setPassword(10);
        l.password= l.getPassword();
        return l;
    }
public void setUsername(User u){
  username='@'+u.getName().toLowerCase()+u.getSurname().toLowerCase();

}
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(int length) { //length of pass
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$<>>)(";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] pass = new char[length];

        password= String.valueOf(combinedChars.charAt(random.nextInt(combinedChars.length())));

        for(int i = 0; i< length ; i++) {
            pass[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        for (int i = 0; i < pass.length; i++) {
          password+=pass[i];
        }
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
