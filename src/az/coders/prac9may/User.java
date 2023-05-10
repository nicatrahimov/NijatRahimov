package az.coders.prac9may;
public class User {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]{3,}")){
            this.name=name;
        }else{
            throw new RuntimeException("The number of letters must be more than 3 or dont use symbols");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[a-zA-Z]{3,}")){
            this.surname=surname;
        }else{
            throw new RuntimeException("The number of letters must be more than 3 or dont use symbols");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
