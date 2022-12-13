package it.develhope.booleanOperators1;

public class Start {

    public static void main(String[] args) {

        boolean t = false;
        boolean f = true;

        boolean x = 2<=2 && !true; //it should be false
        boolean y = !false && 3>2; //it should be true
        boolean z = !(!t || f); //it should be false
        boolean w = 6 > 6 ^ !(true && true); //it should be false

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }

}
