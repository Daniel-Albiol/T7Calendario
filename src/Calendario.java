public class Calendario {
    int dia;
    int anyo;
    //enum Meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
    int mes;

    // Constructor

    Calendario(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    // Métodos
    void incrementaDia() {

        if (mes ==  2) {
            if (dia ==  29) {
                dia = 1;
            }
        }
    }
    if((dia < 30) && (mes <> 2))

    {

        dia += 1;
    }
    else

    {
        System.out.println("Fecha erronea.");
    }

    void incrementaMes() {
        if (mes ==  12) {
            mes = 1;
        }
        if (mes < 1) {
            System.out.println("Mes erroneo.");
        } else {
            mes += 1;
        }
    }

    void incrementaAnyo(int anyo) {
        anyo += 1;
    }

    int mostrarFecha() {

        System.out.println("La fecha actual es " + dia + " de " + mes + " de " + anyo);
    }

    boolean sonIguales(int diaO, int mesO, int anyoO) {

        if (diaO == dia) {
            if (mesO == mes) {
                if (anyoO == anyo) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } else {
            return false;
        }
    }


}
