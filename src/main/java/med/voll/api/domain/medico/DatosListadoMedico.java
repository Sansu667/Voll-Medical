package med.voll.api.domain.medico;

public record DatosListadoMedico(Long Id, String nombre, String especialidad, String documento, String email) {

    public DatosListadoMedico(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
