package org.example;

/**
 * Hello world!
 */
public class App extends Mouse1 {
    public static void main(String[] args) {
App d = new App();
d.setName("Nicole Mouse");

      Mouse1 m1 = new Mouse1();
        m1.setBrand("HP ");

        System.out.println( "You Are Using a Mouse!" );
        //Display
        System.out.println(  d.getName() + "\t" + m1.getBrand());

        m1.scrollDownColor();

        System.out.println( "You Are Using "+ d.getName() );

        m1.leftClickSound();
        m1.rightClickSound();

    }

}
