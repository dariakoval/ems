package org.aston.ems.admin_service.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aston.ems.admin_service.dto.UserReqDto;
import org.aston.ems.admin_service.dto.UserResDto;
import org.aston.ems.admin_service.mapper.UserMapper;
import org.aston.ems.admin_service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/admin/internal/users", produces = "application/json")
@Validated
public class UserWithoutAuthController {

	private final UserService service;
	private final UserMapper mapper;

	@GetMapping
	public List<UserResDto> get(){
		return service.get().stream().map(mapper::toResDto).toList();
	}



}
