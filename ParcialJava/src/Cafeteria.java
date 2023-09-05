import javax.imageio.stream.ImageInputStream;

public class Cafeteria {
    /*
    Nombre: Wilmer Moncada Parra
    ID: 702523
    Materia: Arquitectura de datos
    Ingenieria de sistemas

    Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima
    de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café
    que hay en la cafetera). Implementa, al menos, los siguientes métodos:
    1. Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.)
    y la actual en cero (cafetera vacía).
    2. llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
    3. servirTaza(int): simula la acción de servir una taza con la capacidad indicada.
    Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    4. vaciarCafetera(): pone la cantidad de café actual en cero.
    5. agregarCafe(int): añade a la cafetera la cantidad indicada.
     */

    private int capacidad_Maxima = 1000;
    private int cantidad_Actual = 0;

    public Cafeteria() {
        this.capacidad_Maxima = 1000;
        this.cantidad_Actual = 0;
    }
    public void llenarCafetera() {
        this.cantidad_Actual = this.capacidad_Maxima;
    }

    public void servirTaza(int capacidadTaza) {
        if (this.cantidad_Actual >= capacidadTaza) {
            this.cantidad_Actual -= capacidadTaza;
            System.out.println("Se ha servido una taza de café de " + capacidadTaza + " c.c.");
        } else {
            System.out.println("No hay la cantidad suficiente de café para llenar la taza.");
            System.out.println("Se ha servido una taza de café de " + this.cantidad_Actual + " c.c.");
            this.cantidad_Actual = 0;
        }
    }
    public void vaciar_Cafetera(int capacidad_Maxima){
        this.cantidad_Actual = 0;
        }

    public void agregarCafe(int cantidad) {
        if (this.cantidad_Actual + cantidad <= this.capacidad_Maxima) {
            this.cantidad_Actual += cantidad;
        } else {
            this.cantidad_Actual = this.capacidad_Maxima;
        }
    }

}

