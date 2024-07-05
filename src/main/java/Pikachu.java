public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Placaje de Pikachu");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Arañazo de Pikachu");

    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Mordisco de Pikachu");

    }

    @Override
    public void ataqueImpactTrueno() {
        System.out.println("Impact trueno de Pikachu");

    }

    @Override
    public void ataquePunioTrueno() {
        System.out.println("Punio de trueno de Pikachu");

    }


}
