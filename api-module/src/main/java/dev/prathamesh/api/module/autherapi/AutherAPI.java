package dev.prathamesh.api.module.autherapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.prathamesh.data.module.dto.Auther;
import dev.prathamesh.service.module.auther.AutherService;

@RestController
@RequestMapping("/auther")
public class AutherAPI {

	private AutherService autherService;

	public AutherAPI(AutherService autherService) {
		this.autherService = autherService;
	}
	
	@GetMapping
	public ResponseEntity<Auther> getAuther() {
		return new ResponseEntity<>(autherService.getAuther(), HttpStatus.OK);
	}

}
