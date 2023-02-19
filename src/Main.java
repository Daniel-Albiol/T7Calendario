public class Main {
    public static void main(String args) {

        Calendario calendario = new Calendario(19, 2, 2023);
        calendario.incrementaDia();
        calendario.incrementaMes();
        calendario.incrementaAnyo(2);
        calendario.mostrarFecha();
        System.out.println("A continuación comprobamos si la fecha es igual a una dada al azar.");
        //Calendario otraFecha = new Calendario();
        System.out.println("La fecha es igual? " + calendario.sonIguales(17, 2, 2023));

    }
}
