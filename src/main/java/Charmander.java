public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Placaje de Charmander");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Arañazo de Charmander");

    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Mordisco de Charmander");

    }

    @Override
    public void ataquePunioFuego() {
        System.out.println("Punño de fuego de Charmander");

    }

    @Override
    public void ataqueLanzaLlamas() {
        System.out.println("Lanza llamas de Charmander");

    }

    @Override
    public void ataqueAscuas() {
        System.out.println("Ascuas de Charmander");

    }
}
