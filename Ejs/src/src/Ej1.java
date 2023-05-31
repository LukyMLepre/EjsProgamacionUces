public class Ej1 {

    public static void main(String[] args) {
        String[] palabras = {"camila", "nestor", "carlos", "camilo", "eduardo", "julian"};
        char caracter = 'c';
        int contadorPalabras = 0;
        for (String palabra : palabras) {
            if (palabra.charAt(0) == caracter) {
                contadorPalabras++;
            }
        }
        System.out.println("La cantidad de palabras que comienzan con la letra: " + caracter + " es : " + contadorPalabras);
    }
}