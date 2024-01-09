package com.devlucasmartins.estudorest.controller;

import com.devlucasmartins.estudorest.model.UsuarioModel;
import com.devlucasmartins.estudorest.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsuarioController {
    private final UsuarioRepository repository;

    @GetMapping
    public List<UsuarioModel> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody UsuarioModel user) {
        repository.save(user);
    }

    @PutMapping
    public void update(@RequestBody UsuarioModel user) {
        repository.save(user);
    }

    @GetMapping("/{username}")
    public UsuarioModel find(@PathVariable("/username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id) {
        repository.deleteById(id);
    }
}
