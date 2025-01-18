import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class MenuProductos {

  public static void main(String[] args) {
    int opcionIndice = 0;
    do {
      Map<String, Integer> opciones = new HashMap<>();
      opciones.put("Agregar", 1);
      opciones.put("Actualizar", 2);
      opciones.put("Eliminar", 3);
      opciones.put("Listar", 4);
      opciones.put("Salir", 5);

      Object[] opArreglo = opciones.keySet().toArray();

      Object opcion = JOptionPane.showInputDialog(null,
          "Seleccione una opcion",
          "Mantenedor de usuario",
          JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

      if (opcion == null) {
        JOptionPane.showMessageDialog(null, "debe seleccionar una opcion");
      } else {
        opcionIndice = opciones.get(opcion.toString());

        String mensaje = null;
        switch (opcionIndice) {
          case 1:
            mensaje = "Agregando producto";
            JOptionPane.showMessageDialog(null, mensaje);
            System.out.println(mensaje);
            break;
          case 2:
            mensaje = "Actualizando producto";
            JOptionPane.showMessageDialog(null, mensaje);
            System.out.println(mensaje);
            break;
          case 3:
            mensaje = "Eliminando producto";
            JOptionPane.showMessageDialog(null, mensaje);
            System.out.println(mensaje);
            break;
          case 4:
            mensaje = "Listando productos";
            JOptionPane.showMessageDialog(null, mensaje);
            System.out.println(mensaje);
            break;
        }
      }

    } while (opcionIndice != 5);
    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
  }
}
