package com.metehanmengen.kodlama.io.devs.data_access.concretes;

import com.metehanmengen.kodlama.io.devs.data_access.abstracts.IProgrammingLanguageRepository;
import com.metehanmengen.kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProgrammingLanguageRepository implements IProgrammingLanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages;

    @Override
    public boolean add(ProgrammingLanguage programmingLanguage)
    {
        return programmingLanguages.add(programmingLanguage);
    }

    @Override
    public boolean delete(int id)
    {
        return programmingLanguages.remove(id) != null ;
    }

    @Override
    public boolean update(ProgrammingLanguage programmingLanguage)
    {
        if (programmingLanguage.getId() < 0 || programmingLanguage.getId() > programmingLanguages.size())
            return false;

        programmingLanguages.set(programmingLanguage.getId(), programmingLanguage);

        return true;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        List<ProgrammingLanguage> all = programmingLanguages.stream().toList();

        return all;
    }
}
