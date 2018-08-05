import mir00r.builder.PaninoStepBuilder;
import mir00r.model.Panino;

public class Main {

    public static void main(String[] args) {
        Panino solPanino = PaninoStepBuilder.newBuilder()
                .paninoCalled("Sole Panino")
                .breadType("baguette")
                //.fish("Tuna")
                .meat("Cow")
                // .noCheesePlease()
                .withCheese("gorgonzola")
                .addVegetable("Tomato")
                .addVegetable("Capsicum")
                .addVegetable("Carrot")
                //.noVegetablesPlease()
                .noMoreVegetablesPlease()
                .build();
        System.out.println(solPanino);
    }
}
