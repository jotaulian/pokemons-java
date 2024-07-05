public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();

        // Creamos listado de pokemons usando polimorfismo, los agrupamos según la clase padre "Pokemon"
        Pokemon[] listaPokemons = {pikachu, squirtle,charmander,bulbasur};

        // Invocamos un método común para todos los Pokemon's
        System.out.println("--- Ataque común para todos los pokemons ---");
        for (Pokemon pokemon : listaPokemons){
            pokemon.ataquePlacaje();
        }

        //Invocamos métodos especiales de cada pokemon (los que implementan por interfaz)
        System.out.println("--- Ataques especiales ---");
        pikachu.ataqueImpactTrueno();
        squirtle.ataquePistolaAgua();
        charmander.ataqueLanzaLlamas();
        bulbasur.ataqueParalizar();

    }
}
