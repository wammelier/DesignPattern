import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // 릭의 기타 재고 목록 셋업(초기화)
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitar = inventory.search(whatErinLikes);
        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println(
                 guitar.getBuilder() + "" + guitar.getModel() + "" +
                    guitar.getType() + " guitar:\n " +
                    guitar.getTopWood() + " top.|nYou can have it for only $" +
                    guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        // 기타들을 재고 목록에 등록
    }
}
