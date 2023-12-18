package com.ensias.scolarite.cours;

<<<<<<< HEAD
//changement de kenza pour le test 
=======
//changement oumaima pour test
>>>>>>> new-feature

import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface CoursRepository extends CrudRepository<Cours, Integer>{

public List<Cours> findByModuleId(Integer moduleId);
}
