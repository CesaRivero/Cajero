import javax.swing.JOptionPane;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cajero cajero = new Cajero(5000);
        Persona empleado = new Persona("Carlos", "Perez");
        Cliente cliente = new Cliente("Cesar", "Rivero", 2000, "Corriente", "1234");

        String clave2;
        String nombre=JOptionPane.showInputDialog("Ingrese Nombre");
        String pin= JOptionPane.showInputDialog("Ingrese pin");
//muy estructurado
        JOptionPane.showMessageDialog(null, cliente.ingresar(nombre,pin));

        do {
            String clave = JOptionPane.showInputDialog("1-Retirar dinero\n2-Cambiar pin\n3-Historial de movimientos\n4-Cargar cajero\n0-Salir");


            switch (clave) {

                case "1":
                    int montoRetirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a retirar"));
                    JOptionPane.showMessageDialog(null, cliente.retirarDinero(cajero, montoRetirar));
                    break;

                case "2":
                    String NuevoPin = JOptionPane.showInputDialog("Ingrese nuevo pin");
                    JOptionPane.showMessageDialog(null, cliente.cambiarPin(NuevoPin));

                    break;
                case "4":
                    int montoAcargar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a cargar"));
                    JOptionPane.showMessageDialog(null, empleado.cargarCajero(cajero, montoAcargar));
                    break;
            }

            JOptionPane.showMessageDialog(null, cajero.getSaldo());

            clave2 = JOptionPane.showInputDialog("1-Retirar dinero\n2-Cambiar pin\n3-Historial de movimientos\n4-Cargar cajero\n0-Salir");

        } while (!clave2.equalsIgnoreCase("0"));
    }
}