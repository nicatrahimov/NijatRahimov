package az.coders.prac16may.abstracttask;

public class DuzbucaqliUcbucaq extends Forma {


    public DuzbucaqliUcbucaq(double teref){
        super(teref);  //Kicik kateti daxil etmek ucun constructor
    }
    @Override
    double getSahe(double teref) {
return 0;
    }

    @Override
    double getPerimeter(double teref) {
        return  (teref+Math.sqrt(3)/2*teref+2*teref);
    }
}
