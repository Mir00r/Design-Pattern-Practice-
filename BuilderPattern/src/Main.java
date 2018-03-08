import mir00r.builder.PaninoBuilder;
import mir00r.model.Panino;

public class Main {

    public static void main(String[] args) {
        Panino marcoPanino = new PaninoBuilder()
                .paninoCalled("marcoPanino")
                .breadType("baguette")
                .withFish("Tuna")
                .withCheese("gorgonzola")
                .withMeat("ham")
                .withVegetable("tomatos")
                .build();

        System.out.println(marcoPanino);
    }
}
