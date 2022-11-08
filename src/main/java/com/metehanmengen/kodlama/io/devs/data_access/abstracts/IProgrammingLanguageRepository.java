package com.metehanmengen.kodlama.io.devs.data_access.abstracts;

import com.metehanmengen.kodlama.io.devs.entities.ProgrammingLanguage;

import java.util.List;

public interface IProgrammingLanguageRepository {
    boolean add (ProgrammingLanguage programmingLanguage);
    boolean delete (int id);
    boolean update (ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();

}
