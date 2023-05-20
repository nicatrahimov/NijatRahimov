package az.coders.prac18may;

public class FinalAlgorithm {
    public static void main(String[] args)  {
        String str = "Nicat";

        str="fehbjenfe";


if (!str.contentEquals("Nicat")){

    try {
        throw new StringExc();
    } catch (StringExc e) {
        System.out.println("FINAL deyer deyisdirile bilmez");
    }
}
    }
}
