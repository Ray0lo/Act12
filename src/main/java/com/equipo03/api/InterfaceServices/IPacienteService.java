package com.equipo03.api.InterfaceServices;
import java.util.List;
import com.equipo03.api.modelo.Paciente;

public class IPacienteService {
    public List<Paciente> listar();
    public Optional<Paciente>listar idCitas(long idCitas);
    public int save (Paciente u);
    public void delete(int id)
}
