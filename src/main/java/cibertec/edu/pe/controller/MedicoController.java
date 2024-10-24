package cibertec.edu.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cibertec.edu.pe.model.Medico;
import cibertec.edu.pe.service.MedicoService;

import java.util.Optional;

@Controller
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public String mostrarListaMedicos(Model model) {
        model.addAttribute("medicos", medicoService.listarTodosLosMedicos());
        return "medicos";
    }

    @PostMapping("/guardar")
    public String guardarMedico(@ModelAttribute("medico") Medico medico) {
        medicoService.guardarMedico(medico);
        return "redirect:/medicos";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Medico> obtenerMedico(@PathVariable Long id) {
        return medicoService.obtenerMedicoPorId(id);
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarMedico(@PathVariable Long id) {
        try {
            medicoService.eliminarMedico(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/medicos";
    }

    @PostMapping("/editar")
    public String editarMedico(@ModelAttribute("medico") Medico medico) {
        medicoService.guardarMedico(medico); // Reutiliza el método guardar para actualizar
        return "redirect:/medicos";
    }
}
