package dev.prathamesh.service.module.autherservice;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import dev.prathamesh.data.module.dto.Auther;

@Service
public class AutherService {

	public Auther getAuther() {
		return new Auther("Prathamesh", LocalDate.now());
	}

}
