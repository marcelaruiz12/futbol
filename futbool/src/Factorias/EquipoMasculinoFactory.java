package Factorias;

import Partes.Arquero;
import Partes.ArqueroHombre;
import Partes.Atacante;
import Partes.AtacanteHombre;
import Partes.Defensor;
import Partes.DefensorHombre;

public class EquipoMasculinoFactory extends EquipoFactory {

@Override
public Arquero crearArquero() {
return new Partes.ArqueroHombre();
}

@Override
public Atacante crearAtacante() {
return new AtacanteHombre();
}

@Override
public Defensor crearDefensor() {
return new DefensorHombre();
}
}