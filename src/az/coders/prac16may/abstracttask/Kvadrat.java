package az.coders.prac16may.abstracttask;

import az.coders.prac16may.abstracttask.Forma;

public class Kvadrat extends Forma {


    public Kvadrat(double teref){
        super(teref);
    }
    @Override
    double getSahe(double teref) {
       return Math.pow(teref,2);
    }

    @Override
    double getPerimeter(double teref) {
       return teref*4;
    }
}
