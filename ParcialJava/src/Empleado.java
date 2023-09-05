public class Empleado {
    /*
    Nombre: Wilmer Moncada Parra
    ID: 702523
    Materia: Arquitectura de datos
    Ingenieria de sistemas

    Crear una clase Empleado que modele la información que una empresa mantiene sobre
    cada empleado: Cedula, sueldo base (1.145.000), pago por hora extra (25.000), horas extra realizadas en el mes, tipo (porcentaje):
    Servicios generales (8%)
    Por emolumentos eclesiásticos (6%)
    Servicios de transporte de carga (4%)
    casado o no y número de hijos.
    Al crear los objetos se podrá proporcionar, el número de DNI.
    Los demás servicios que deberán proporcionar los objetos de la clase serán los siguientes:
    1.	Cálculo y transacción del valor correspondiente a las horas extra realizadas.
    2.	Cálculo y transacción del sueldo bruto.
    3.	Cálculo y transacción de las retenciones a partir del tipo, teniendo en cuenta
    que el porcentaje de retención que hay que aplicar es el tipo menos 2 puntos si el
    empleado está casado y menos 1 punto por cada hijo que tenga; el porcentaje se
    aplica sobre todo el sueldo bruto.
    4.	visualización de toda la información del empleado. La básica más el
    sueldo base, el complemento por horas extra, el sueldo bruto, la retención y
    el sueldo neto.
     */

    private int Cedula;
    private int sueldo_base = 1145000;
    private int horas_extras = 25000;
    private int horas_realizadas = 8;
    private int transporte = 4;



}
