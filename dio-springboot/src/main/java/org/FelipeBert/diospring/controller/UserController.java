package org.FelipeBert.diospring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.FelipeBert.diospring.model.User;
import org.FelipeBert.diospring.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = {"application/json"})
@Tag(name = "User Api")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    @Operation(summary = "Realiza o GET de todos os ususarios", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuarios encotrados com sucesso!"),
            @ApiResponse(responseCode = "404", description = "Usuario não encontrado"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    public List<User> getUsers(){
        return userRepository.listAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Realiza a busca de um usuario pelo id", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario encotrado com sucesso!"),
            @ApiResponse(responseCode = "404", description = "Usuario não encontrado"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    public User getUserById(@PathVariable("id") Integer id){
        return userRepository.finById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta um usuario via Id", method = "DELETE")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario deletado com sucesso!"),
            @ApiResponse(responseCode = "404", description = "Usuario não encontrado"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    public void delete(@PathVariable("id") Integer id){
        userRepository.remove(id);
    }

    @Operation(summary = "Cria um novo usuario", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario criado com sucesso!"),
            @ApiResponse(responseCode = "404", description = "Recurso não encontrado"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    @PostMapping
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }
}
