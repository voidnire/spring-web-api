package dio.spring_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.spring_web_api.model.Usuario;
import dio.spring_web_api.repository.UserRepository;


@RestController
@RequestMapping("/users")
public class UsuarioController {
	@Autowired
	private UserRepository repos;
	@GetMapping()
	public List<Usuario> getUsers(){
		return repos.findAll();
	}
	
	@GetMapping("/{username}")
	public Usuario getUser(@PathVariable("username") String username){
		return repos.findByUsername(username);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Integer id){
		repos.deleteById(id);
	}
	
	@PostMapping()
	public void postUser(@RequestBody Usuario user){
		repos.save(user);
	}
	
	@PutMapping()
	public void putUser(@RequestBody Usuario user){
		repos.save(user);
	}
}
