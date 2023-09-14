import Factorias.EquipoFactory;
import Factorias.EquipoFemeninoFactory;
import Factorias.EquipoMasculinoFactory;
import Partes.Arquero;
import Partes.Atacante;
import Partes.Defensor;

public class App {
public static void main(String[] args) throws Exception {
crearEquipo(new EquipoFemeninoFactory());
crearEquipo(new EquipoMasculinoFactory());
}

public static void crearEquipo(EquipoFactory factory){
Arquero arquero = factory.crearArquero();
Defensor defensor = factory.crearDefensor();
Atacante atacante = factory.crearAtacante();

System.out.println("****Un equipo fue creado: ****");
System.out.println(arquero.saqueArco());
System.out.println(defensor.barrida());
System.out.println(atacante.cabezazoOfencivo());
}
}