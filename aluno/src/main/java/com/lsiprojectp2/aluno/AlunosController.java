package com.lsiprojectp2.aluno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @GetMapping
    public List<Aluno> findAll() {
        return new ArrayList<Aluno>();
    }

}
