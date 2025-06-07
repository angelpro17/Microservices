package org.anampa.springcloud.msvc.usuarios.services;
import org.anampa.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(Long id); //es un wrapper buena practica
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);

    Optional<Usuario> porEmail(String email);
}
