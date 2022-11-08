package com.metehanmengen.kodlama.io.devs.business.concretes;

import com.metehanmengen.kodlama.io.devs.business.abstracts.IProgrammingLanguageService;
import com.metehanmengen.kodlama.io.devs.data_access.abstracts.IProgrammingLanguageRepository;
import com.metehanmengen.kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService {
    private IProgrammingLanguageRepository repository;

    public ProgrammingLanguageManager(IProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean add(ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage == null) {
            System.out.println("Dil Seçiniz:");
            return false;
        }

        for (var lang : getAll())
            if (lang.getName().equals(programmingLanguage.getName())) {
                System.out.println("Aynı isimde dil girildi.");
                return false;
            }
        repository.add(programmingLanguage);
        return true;
    }

    @Override
    public boolean delete(int id) {

        for (var lang : getAll())
            if (lang.getId() == id) {
                System.out.println(id + "numarali dil silindi.");
                return true;
            }
        System.out.println(id + "numaralı dil bulunamadı");
        return false;
    }

    @Override
    public boolean update(ProgrammingLanguage programmingLanguage)
    {
        return repository.update(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }
}
