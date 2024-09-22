//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("¡Bienvenido(a) a Scrren Match!");
        System.out.println("Pelicula: Matrix");


        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlano = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        String Sinopsis = """
                Matrix es una paradoga
                La megor pelicula del fin del milenio
                Fue lanzada en:""" + " "  + fechaDeLanzamiento + " " + """
                 obtuvo una nota de:""" + " " + notaDeLaPelicula;
        System.out.println(Sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);




    }
}