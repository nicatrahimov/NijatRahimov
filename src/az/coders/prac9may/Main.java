package az.coders.prac9may;
public class Main {
    public static void main(String[] args) {
User u = new User();
Login l = new Login();
u.setName("Nicat");
u.setSurname("Rahimov");
u.setAge(20);
        System.out.println(u.getAge());
l.setPassword(6);
l.setUsername(u);
        System.out.println(l.loginGenerator(u));


        System.out.println(u);
        System.out.println(l);
    }
}
