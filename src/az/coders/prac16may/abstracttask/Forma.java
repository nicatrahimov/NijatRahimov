package az.coders.prac16may.abstracttask;

public abstract class Forma {
    double teref;


    public Forma(double teref){
        this.teref=teref;
    }
abstract double getSahe(double teref);
    abstract double getPerimeter(double teref);



}
