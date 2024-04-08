import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new Animal("Jacaré"));
        listaAnimais.add(new Animal("Leão"));
        listaAnimais.add(new Animal("Girafa"));
        listaAnimais.add(new Animal("Elefante"));
        listaAnimais.add(new Animal("Zebra"));
        listaAnimais.add(new Animal("Cachorro"));
        listaAnimais.add(new Animal("Gato"));
        listaAnimais.add(new Animal("Cobra"));
        listaAnimais.add(new Animal("Morcego"));

        // Ordenando a lista de animais por nome utilizando lambda
        listaAnimais.sort(Comparator.comparing(Animal::getNome));

        // Exibindo a lista ordenada
        System.out.println("Lista de animais ordenada:");
        for (Animal animal : listaAnimais) {
            System.out.println(animal.getNome());
        }
    }
}