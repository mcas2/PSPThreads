package EjerciciosRepasoUT2.BufferMonitor1;
/*De parte de Rodrigo, Tirso y Mario

* Crea un concesionario en el que varios talleres (3) produzcan coches de 3 gamas (Porsche, BMW y Seat).
* Crea una serie de clientes (9) de distintas clases sociales (alta, media y baja) que sólo puedan comprar coches
* que les resulten accesibles (porsche=alta, bmw=media y seat=baja).
* El concesionario permite la producción de coches de marca alterna, de forma que no entren dos coches iguales seguidos
* en el escaparate. El escaparate tiene un tamaño de 30 coches (es grande), y en el momento en el que este se llenara,
* los talleres tendrían que esperar para producir más.
*
* Nuestra duda, Elisa, es básicamente la siguiente: ¿Por qué no acaba nuestro proceso dado este código? Si le quitamos
* las condiciones del while del método consumir termina sin problema, pero sólo somos capaces de imaginar que en algún
* momento las condiciones hacen un cuello de botella y no nos deja seguir.
*
* Muchas gracias y un abrazo.
* */

public class Main {
    public static void main(String[] args) {
        Concesionario c = new Concesionario();
        Taller taller1 = new Taller(c,"Porsche", "T.Paco");
        Taller taller2 = new Taller(c,"BMW", "T.Plaza");
        Taller taller3 = new Taller(c,"Seat", "T.Chumbimba");

        Clientes c1 = new Clientes(c,"Borja", "alta");
        Clientes c2 = new Clientes(c,"Cayetana", "alta");
        Clientes c3 = new Clientes(c,"Leonardo", "alta");
        Clientes c4 = new Clientes(c,"Álvaro", "media");
        Clientes c5 = new Clientes(c,"Alejandro", "media");
        Clientes c6 = new Clientes(c,"Daniel", "media");
        Clientes c7 = new Clientes(c,"Tirso", "baja");
        Clientes c8 = new Clientes(c,"Enrique", "baja");
        Clientes c9 = new Clientes(c,"Rodrigo", "baja");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
    }
}
