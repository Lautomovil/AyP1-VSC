public class ReCadena {
    private char[] chars;

    public int longitud() {
        return this.chars.length;
    }

    // Constructor que recibe un String
    public ReCadena(String string) {
        this.chars = string.toCharArray();
    }

    public boolean esVacia() {
        return this.chars.length == 0;
    }

    public boolean contiene(char letra) {
        for (int i = 0; i < this.longitud(); i++) {
            if (this.chars[i] == letra) {
                return true;
            }
        }
        return false;
    }

    public boolean esDigito(char c) {
        return Character.isDigit(c);
    }

    public boolean esLetra(char c) {
        return Character.isLetter(c);
    }

    public boolean esMayuscula(char c) {
        return Character.isUpperCase(c);
    }

    public boolean esMinuscula(char c) {
        return Character.isLowerCase(c);
    }

    public boolean esVocal(char c) {
        char minuscula = Character.toLowerCase(c);
        return minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u';
    }

    public boolean esConsonante(char c) {
        return esLetra(c) && !esVocal(c);
    }

    // Constructor que recibe un array de char
    public ReCadena(char[] chars) {
        this.chars = chars;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.longitud(); i++)
            s += this.chars[i];
        return s;
    }

    public ReCadena concatenar(ReCadena c) {
        char[] nuevaCadena = new char[this.longitud() + c.longitud()];
        // Copiar los caracteres de la cadena actual
        for (int i = 0; i < this.longitud(); i++) {
            nuevaCadena[i] = this.chars[i];
        }

        // Copiar los caracteres de la cadena pasada como parámetro
        for (int i = 0; i < c.longitud(); i++) {
            nuevaCadena[this.longitud() + i] = c.chars[i];
        }

        // Devolver una nueva instancia de ReCadena con el array concatenado
        return new ReCadena(nuevaCadena);
    }

    public boolean sonIguales(ReCadena c) {
        String cadena1 = new String(this.chars);
        String cadena2 = new String(c.chars);
        return cadena1.equalsIgnoreCase(cadena2);
    }

    // Método para transformar a minúsculas
    public ReCadena minusculas() {
        char[] minChars = new char[this.longitud()];
        for (int i = 0; i < this.longitud(); i++) {
            minChars[i] = Character.toLowerCase(this.chars[i]);
        }
        return new ReCadena(minChars);
    }

    // Método para comparar cadenas
    public boolean sonEquivalentes(ReCadena c) {
        return this.sonIguales(c); // Usa sonIguales que ignora mayúsculas
    }

    // Método para obtener consonantes
    public ReCadena consonantes() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < this.longitud(); i++) {
            if (esConsonante(this.chars[i])) {
                resultado.append(this.chars[i]);
            }
        }
        return new ReCadena(resultado.toString());
    }

    // Método para calcular la frecuencia de un carácter
    public int frecuencia(char c) {
        int count = 0;
        for (int i = 0; i < this.longitud(); i++) {
            if (this.chars[i] == c) {
                count++;
            }
        }
        return count;
    }

    // Método para mostrar frecuencias de letras
    public void frecuencias() {
        int[] frecuencia = new int[26]; // Para letras A-Z
        for (int i = 0; i < this.longitud(); i++) {
            if (esLetra(this.chars[i])) {
                char letra = Character.toLowerCase(this.chars[i]);
                frecuencia[letra - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (frecuencia[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frecuencia[i]);
            }
        }
    }

    // Método para transliterar
    public ReCadena transliterar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < this.longitud(); i++) {
            char c = this.chars[i];
            switch (c) {
                case 'á':
                case 'à':
                case 'ä':
                case 'â':
                    resultado.append('a');
                    break;
                case 'é':
                case 'è':
                case 'ë':
                case 'ê':
                    resultado.append('e');
                    break;
                case 'í':
                case 'ì':
                case 'ï':
                case 'î':
                    resultado.append('i');
                    break;
                case 'ó':
                case 'ò':
                case 'ö':
                case 'ô':
                    resultado.append('o');
                    break;
                case 'ú':
                case 'ù':
                case 'ü':
                case 'û':
                    resultado.append('u');
                    break;
                case 'ñ':
                    resultado.append('n');
                    break;
                default:
                    resultado.append(c);
                    break;
            }
        }
        return new ReCadena(resultado.toString());
    }

    // Método para invertir la cadena
    public ReCadena invertir() {
        StringBuilder resultado = new StringBuilder();
        for (int i = this.longitud() - 1; i >= 0; i--) {
            resultado.append(this.chars[i]);
        }
        return new ReCadena(resultado.toString());
    }

    // Método para verificar si es palíndromo
    public boolean esPalindromo() {
        int inicio = 0;
        int fin = this.longitud() - 1;
        while (inicio < fin) {
            if (Character.toLowerCase(this.chars[inicio]) != Character.toLowerCase(this.chars[fin])) {
                return false; // No es palíndromo
            }
            inicio++;
            fin--;
        }
        return true; // Es palíndromo
    }

    // Método mejorado para verificar palíndromos en frases
    public boolean esFrasePalindromo() {
        StringBuilder soloLetras = new StringBuilder();
        for (char c : this.chars) {
            if (esLetra(c)) {
                soloLetras.append(Character.toLowerCase(c));
            }
        }
        ReCadena cadenaLimpia = new ReCadena(soloLetras.toString());
        return cadenaLimpia.esPalindromo(); // Utiliza el método esPalindromo
    }

    // Método para verificar si dos cadenas son anagramas
    public boolean esAnagramaDe(ReCadena c) {
        if (this.longitud() != c.longitud()) {
            return false; // No pueden ser anagramas si tienen diferente longitud
        }

        int[] conteo = new int[26]; // Para letras A-Z
        for (int i = 0; i < this.longitud(); i++) {
            char letra = Character.toLowerCase(this.chars[i]);
            conteo[letra - 'a']++;
        }
        for (int i = 0; i < c.longitud(); i++) {
            char letra = Character.toLowerCase(c.chars[i]);
            conteo[letra - 'a']--;
            if (conteo[letra - 'a'] < 0) {
                return false; // Hay más letras en c que en this
            }
        }
        return true; // Son anagramas
    }

    // Método para verificar si c se forma con letras de this
    public boolean seFormaConLetrasDe(ReCadena c) {
        int[] conteo = new int[26]; // Para letras A-Z
        for (int i = 0; i < this.longitud(); i++) {
            char letra = Character.toLowerCase(this.chars[i]);
            conteo[letra - 'a']++;
        }
        for (int i = 0; i < c.longitud(); i++) {
            char letra = Character.toLowerCase(c.chars[i]);
            conteo[letra - 'a']--;
            if (conteo[letra - 'a'] < 0) {
                return false; // Hay más letras en c que en this
            }
        }
        return true; // Se puede formar c con letras de this
    }

    public static void main(String[] args) {
        // Ejemplos de uso de los métodos
        ReCadena cadena1 = new ReCadena("Hola");
        ReCadena cadena2 = new ReCadena("hOlA");

        System.out.println("Longitud: " + cadena1.longitud());
        System.out.println("Es vacía: " + cadena1.esVacia());
        System.out.println("Contiene 'l': " + cadena1.contiene('l'));
        System.out.println("En minúsculas: " + cadena1.minusculas());
        System.out.println("Son equivalentes: " + cadena1.sonEquivalentes(cadena2));
        System.out.println("Consonantes: " + new ReCadena("hola como estas").consonantes());
        System.out.println("Frecuencia de 'o': " + cadena1.frecuencia('o'));
        System.out.println("Frecuencias:");
        cadena1.frecuencias();
        System.out.println("Transliterar: " + new ReCadena("Nicolás").transliterar());
        System.out.println("Invertir: " + cadena1.invertir());
        System.out.println("Es palíndromo: " + new ReCadena("Anita lava la tina").esFrasePalindromo());
        System.out.println("Es anagrama de 'Hola': " + cadena1.esAnagramaDe(new ReCadena("oalH")));
        System.out.println("Se forma con letras de 'Hoal': " + cadena1.seFormaConLetrasDe(new ReCadena("Hoal")));
    }
}
