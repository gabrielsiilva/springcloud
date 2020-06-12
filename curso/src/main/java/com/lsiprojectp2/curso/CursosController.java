package com.lsiprojectp2.curso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosController {
  
  @GetMapping
  public List<Curso> findAll() {
      return new ArrayList<Curso>();
  }

}
