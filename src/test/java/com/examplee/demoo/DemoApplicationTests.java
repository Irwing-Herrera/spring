package com.examplee.demoo;

import static org.junit.Assert.assertTrue;

import com.examplee.demoo.models.Usuario;
import com.examplee.demoo.repositories.IUsuarioRepo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private IUsuarioRepo iUsuarioRepo;

	// @Autowired
	// private BCryptPasswordEncoder encoder;

	@Test
	public void crearUsuarioTest() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("Irwing");
		// usuario.setClave(encoder.encode("1234"));
		usuario.setClave("1234");

		Usuario retorno = iUsuarioRepo.save(usuario);
		assertTrue(retorno.getClave().equalsIgnoreCase(usuario.getClave()));
	}

}
