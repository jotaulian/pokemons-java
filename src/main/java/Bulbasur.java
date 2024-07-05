public class Bulbasur extends Pokemon implements  IPlanta{

    public Bulbasur() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Placaje de Bulbasur");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Arañazo de Bulbasur");

    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Mordisco de Bulbasur");

    }

    @Override
    public void ataqueDrenaje() {
        System.out.println("Drenaje de Bulbasur");

    }

    @Override
    public void ataqueParalizar() {
        System.out.println("Paralización de Bulbasur");

    }
}
