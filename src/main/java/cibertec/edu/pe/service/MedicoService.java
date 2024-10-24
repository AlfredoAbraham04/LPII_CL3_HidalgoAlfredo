package cibertec.edu.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cibertec.edu.pe.model.Medico;
import cibertec.edu.pe.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> listarTodosLosMedicos() {
        return medicoRepository.findAll();
    }

    public void guardarMedico(Medico medico) {
        medicoRepository.save(medico);
    }

    public Optional<Medico> obtenerMedicoPorId(Long id) {
        return medicoRepository.findById(id);
    }

    public void eliminarMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
