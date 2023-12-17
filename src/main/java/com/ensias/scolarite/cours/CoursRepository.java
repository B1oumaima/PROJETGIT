package com.ensias.scolarite.cours;

//changement de kenza pour le test 

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CoursRepository extends CrudRepository<Cours, Integer>{

public List<Cours> findByModuleId(Integer moduleId);
}
