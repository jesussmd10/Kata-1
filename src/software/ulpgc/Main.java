package software.ulpgc;


import java.time.LocalDate;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Superman","Fly,Super strength,Rays in the eyes",10, "Kriptonita", LocalDate.of(1990,4,1));
        System.out.println(hero);

    }
}