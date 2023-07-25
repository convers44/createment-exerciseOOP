package createment.oop.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {


    public static void main(String[] args) {
        CabinClass c = CabinClass.ECONOMY;

        for (CabinClass cabinClass : CabinClass.values()) {
            System.out.println(cabinClass.name());
        }

    }

    public enum CabinClass {
        ECONOMY,
        BUSINESS,
        FIRST_CLASS
    }

}
