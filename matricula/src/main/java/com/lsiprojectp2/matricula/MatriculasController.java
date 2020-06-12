package com.lsiprojectp2.matricula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculasController {

  @GetMapping
  public List<Matricula> findAll() {
      return new ArrayList<Matricula>();
  }

}