package com.lsiprojectp2.professor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

  @GetMapping
  public List<Professor> findAll() {
      return new ArrayList<Professor>();
  }

}