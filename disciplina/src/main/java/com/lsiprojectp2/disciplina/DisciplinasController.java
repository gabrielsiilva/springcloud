package com.lsiprojectp2.disciplina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinasController {

  @GetMapping
  public List<Disciplina> findAll() {
      return new ArrayList<Disciplina>();
  }

}