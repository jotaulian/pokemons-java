public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void ataquePlacaje () {
        System.out.println("Placaje de Squirtle");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Arañazo de Squirtle");

    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Mordisco de Squirtle");

    }

    @Override
    public void ataqueHidrobomba() {
        System.out.println("Hidrobomba de Squirtle");

    }

    @Override
    public void ataquePistolaAgua() {
        System.out.println("Pistola de agua de Squirtle");

    }
}