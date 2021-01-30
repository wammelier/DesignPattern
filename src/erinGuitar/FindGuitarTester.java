package erinGuitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // 릭의 기타 재고 목록 셋업(초기화)
        Inventory inventory = new Inventory();
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

        inventory.addInstrument("aaaaa", 124213, guitarSpec);
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
        List matchingGuitar = inventory.search(whatErinLikes);
        System.out.println("matchingGuitar?" + matchingGuitar);
        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                         spec.getType() + " guitar:\n       " +
                        spec.getBackWood() + " back and sides, \n      " +
                         spec.getTopWood() + " top.\nYou can have it for only $" +
                         guitar.getPrice() + "!\n ------");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        // 기타들을 재고 목록에 등록
    }
}
