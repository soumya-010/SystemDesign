package Decorator.PizzaDeliverySystem.Client;

import Decorator.PizzaDeliverySystem.Components.PanTossedPizza;
import Decorator.PizzaDeliverySystem.Components.Pizza;
import Decorator.PizzaDeliverySystem.Components.RegularPizza;
import Decorator.PizzaDeliverySystem.Components.ThinCrustPizza;
import Decorator.PizzaDeliverySystem.Decorators.Bacon;
import Decorator.PizzaDeliverySystem.Decorators.Ham;
import Decorator.PizzaDeliverySystem.Decorators.Pepperoni;

public class PizzaDeliveryApp {
    public static void main(String[] args) {
        Pizza newRegPizza = new RegularPizza("Regular Pizza");
        newRegPizza.getDescription();
        //add Bacon and Ham
        Pizza newRegPizzaWithBacon = new Bacon(newRegPizza);
        Pizza newRegPizzaWithBaconAndHam = new Ham(newRegPizzaWithBacon);

        System.out.println(newRegPizzaWithBaconAndHam.getDescription() + " costs " + newRegPizzaWithBaconAndHam.getCost());

        Pizza newPanTossedPizza = new PanTossedPizza("Pan Tossed Pizza");
        newPanTossedPizza.getDescription();
        //add Pepperoni and CheeseBurst
        Pizza newPanTossedPizzaWithPepperoni = new Pepperoni(newPanTossedPizza);
        Pizza newPanTossedPizzaWithPepperoniAndCheeseBurst = new Pepperoni(newPanTossedPizzaWithPepperoni);

        System.out.println(newPanTossedPizzaWithPepperoniAndCheeseBurst.getDescription() + " costs " + newPanTossedPizzaWithPepperoniAndCheeseBurst.getCost());


        Pizza newThinCrustPizza = new ThinCrustPizza("Thin Crust Pizza");
        newThinCrustPizza.getDescription();
        //add Ham, Bacon, Pepperoni and CheeseBurst
        Pizza newThinCrustPizzaWithHam = new Ham(newThinCrustPizza);
        Pizza newThinCrustPizzaWithHamAndBacon = new Bacon(newThinCrustPizzaWithHam);
        Pizza newThinCrustPizzaWithHamAndBaconAndPepperoni = new Pepperoni(newThinCrustPizzaWithHamAndBacon);
        Pizza newThinCrustPizzaWithHamAndBaconAndPepperoniAndCheeseBurst = new Pepperoni(newThinCrustPizzaWithHamAndBaconAndPepperoni);

        System.out.println(newThinCrustPizzaWithHamAndBaconAndPepperoniAndCheeseBurst.getDescription() + " costs " + newThinCrustPizzaWithHamAndBaconAndPepperoniAndCheeseBurst.getCost());
    }
}
