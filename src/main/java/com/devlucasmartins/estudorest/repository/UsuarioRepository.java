package com.devlucasmartins.estudorest.repository;

import com.devlucasmartins.estudorest.handler.BusinessException;
import com.devlucasmartins.estudorest.handler.CampoObrigatorioException;
import com.devlucasmartins.estudorest.model.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void validarCampos(UsuarioModel usuario) {
        if (usuario.getLogin() == null) {
            throw new CampoObrigatorioException("login");
        } else if (usuario.getPassword() == null)
            throw new CampoObrigatorioException("password");
    }

    public void save(UsuarioModel usuario) {
        validarCampos(usuario);

        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<UsuarioModel> findAll() {
        System.out.println("LIST - Listando os usários do sistema");
        List<UsuarioModel> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioModel("gleyson", "password"));
        usuarios.add(new UsuarioModel("frank", "masterpass"));
        return usuarios;
    }

    public UsuarioModel findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new UsuarioModel("gleyson", "password");
    }

    public UsuarioModel findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new UsuarioModel("gleyson", "password");
    }
}
