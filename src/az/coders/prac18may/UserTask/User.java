package az.coders.prac18may.UserTask;

import java.util.regex.Pattern;

public class User {
    private String email;
   private String password;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws EmailExc {
        Pattern p = Pattern.compile("^(.+)@(.+)$");
        if (!p.matcher(email).matches()){
            throw new EmailExc("Poct unvani duzgun daxil edilmeyib");
        }else this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PassExc{
        Pattern p = Pattern.compile("^(?=.*[A-Z])$");
        if (!p.matcher(password).matches()){
            throw new PassExc("Sifre duzgun daxil edilmeyib");
        }else this.password = password;

    }
}
