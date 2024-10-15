public class Cadena {
    private char[] chars;

    public int longitud() {
        return this.chars.length;
    }
    //Constructor que recibe un String
    public Cadena(String string) {
      this.chars = string.toCharArray();
    }
   
    public boolean esVacia (){
        return this.chars.length == 0;
    }

    public boolean contiene (char letra){
        for (int i = 0; i < this.longitud(); i++) {
            if (this.chars[i] == letra) {
              return true;
            }
          }
          return false;
        }
    
    public boolean esDigito (char c){
      return Character.isDigit(c);
    } 
    public boolean esLetra (char c){
      return Character.isLetter(c);
    } 
    public boolean esMayuscula (char c){
      return Character.isUpperCase(c);
    }
    public boolean esMinuscula (char c){
      return Character.isLowerCase(c);
    }   
    public boolean esVocal (char c){
      char minuscula = Character.toLowerCase(c);
      return minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u'; 
    }
    public boolean esConsonante (char c){
      return esLetra(c) && !esVocal(c);
    }

    //Constructor que recibe un array de char
    public Cadena(char[] chars) {
      this.chars = chars;
    }
  
    public String toString() {
      String s = "";
      for (int i = 0; i < this.longitud(); i++)
        s += this.chars[i];
      return s;
    }

    public Cadena concatenar(Cadena c){
    char [] nuevaCadena = new char[this.longitud() + c.longitud()];
  // Copiar los caracteres de la cadena actual
  for (int i = 0; i < this.longitud(); i++) {
  nuevaCadena[i] = this.chars[i];
  }

  // Copiar los caracteres de la cadena pasada como parámetro
  for (int i = 0; i < c.longitud(); i++) {
    nuevaCadena[this.longitud() + i] = c.chars[i];
    }

  // Devolver una nueva instancia de Cadena con el array concatenado
  return new Cadena(nuevaCadena);
}
public boolean sonIguales (Cadena c){
  String cadena1 = new String (this.chars);
  String cadena2 = new String(c.chars);
  return cadena1.equalsIgnoreCase(cadena2);
}

public static void main(String[] args) {
  
}
}
  
