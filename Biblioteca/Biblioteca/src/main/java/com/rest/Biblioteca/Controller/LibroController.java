package com.rest.Biblioteca.Controller;

import com.rest.Biblioteca.Model.LibroModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/biblioteca")
public class LibroController {

    private List<LibroModel> listaLibros = new ArrayList<>();

    @GetMapping("/libros")
    public String mostrarLibros(Model model) {
        model.addAttribute("listaLibros", listaLibros);
        model.addAttribute("libro", new LibroModel());
        return "libros";
    }

    @PostMapping("/agregar")
    public String guardarLibro(@ModelAttribute LibroModel libro) {
        listaLibros.add(libro);
        return "redirect:/biblioteca/libros";
    }

    @GetMapping("/editar")
    public String mostrarLibroEditar(@RequestParam int indice, Model model) {
        LibroModel libro = listaLibros.get(indice);
        model.addAttribute("libro", libro);
        model.addAttribute("libroIndex", indice);
        model.addAttribute("generos", List.of("Narrativo", "Lírico", "Dramático", "Didáctico", "Biográfico", "Científico", "Histórico"));
        return "editar_libro";
    }

    @PostMapping("/editar")
    public String editarLibro(@RequestParam int indice, @ModelAttribute LibroModel libro) {
        if (indice >= 0 && indice < listaLibros.size()) {
            listaLibros.set(indice, libro);
        }
        return "redirect:/biblioteca/libros";
    }

    @PostMapping("/eliminar")
    public String eliminarLibro(@RequestParam int indice) {
        if (indice >= 0 && indice < listaLibros.size()) {
            listaLibros.remove(indice);
        }
        return "redirect:/biblioteca/libros";
    }
}
