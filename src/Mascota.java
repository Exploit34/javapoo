import java.util.HashMap;
import javax.swing.JOptionPane;

public class Mascota {
    
    public String nombreM,identificacion,especieM,nombreP;
    public int edadM, cedulaP;
   

    public Mascota(String nombreM, String especieM, int edadM, String identificacion, String nombreP, int cedulaP) {
        this.nombreM = nombreM;
        this.especieM = especieM;
        this.edadM = edadM;
        this.identificacion = identificacion;
        this.nombreP = nombreP;
        this.cedulaP = cedulaP;
    }

    public void emitirSonido() {
        JOptionPane.showMessageDialog(null, nombreM + " está emitiendo un sonido.");
    }

    public void mostrarInformacion() {
        String informacion = "Nombre: " + nombreM + "\n" +
                "Especie: " + especieM + "\n" +
                "Edad: " + edadM + "\n" +
                "Identificación: " + identificacion + "\n" +
                "nombre propietario" + nombreP + "\n" +
                "cedula propietario" + cedulaP;
        JOptionPane.showMessageDialog(null, informacion);
    }


    public void ingresarDatos() {
        nombreM = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
        especieM = JOptionPane.showInputDialog("Ingrese la especie de la mascota:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de la mascota:");
        edadM = Integer.parseInt(edadStr);
        identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota:");
        nombreP = JOptionPane.showInputDialog("ingrse nombre del propietario");
        cedulaP = Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula del propietario"));
    }

    public void validacion(){

        HashMap<String, Mascota> mascotas = new HashMap<>();

        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de mascotas a crear:");
        int cantidad = Integer.parseInt(cantidadStr);

    } 
}