package com.metehanmengen.kodlama.io.devs.web_api;

import com.metehanmengen.kodlama.io.devs.business.abstracts.IProgrammingLanguageService;
import com.metehanmengen.kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class Controller {
    private IProgrammingLanguageService service;

    public Controller(IProgrammingLanguageService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguage language)
    {
        service.add(language);
    }

    @DeleteMapping("/delete{id}")
    public void delete(int id)
    {
        service.delete(id);
    }

    @PutMapping("/update")
    public void update (ProgrammingLanguage language)
    {
        service.update(language);
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll() {
        return service.getAll();
    }

}
