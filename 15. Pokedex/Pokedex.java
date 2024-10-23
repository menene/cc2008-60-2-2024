class Pokedex
{
    public static void main(String[] args)
    {
        Pokemon squirtle = new Squirtle("Squirtle", 150);
        System.out.println(squirtle.showStatus());
        System.out.println(((Squirtle) squirtle).surf());

        Pokemon gyarados = new Gyarados("Gyarados", 150);
        System.out.println(gyarados.showStatus());
        System.out.println(((Gyarados) gyarados).surf());
        System.out.println(((Gyarados) gyarados).hurricane());
    }
}