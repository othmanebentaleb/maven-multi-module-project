package org.transfert.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.transfert.project.entities.Classe;
import org.transfert.project.entities.Etudiant;
import org.transfert.project.repositories.ClasseRepository;
import org.transfert.project.repositories.EtudiantRepository;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "org.transfert.project")
public class TransfertRestApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TransfertRestApplication.class);
    }
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private ClasseRepository classeRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setEmail("othmanebentaleb@gmail.com");
        etudiant1.setNom("bentaleb");
        etudiant1.setPrenom("othmane");
        etudiant1.setTelephone("0637434353");
        Classe classeMaster1 = new Classe();
        classeMaster1.setNiveau("M1");
        classeMaster1.setNom("M1-A");
        Classe classeMaster2 = new Classe();
        classeMaster2.setNiveau("M2");
        classeMaster2.setNom("M1-B");
        Classe classeLicence = new Classe();
        classeLicence.setNiveau("L1");
        classeLicence.setNom("L1-A");
        classeRepository.saveAll(Arrays.asList(classeMaster1,classeMaster2,classeLicence));
        etudiant1.setClasse(classeMaster1);
        etudiantRepository.save(etudiant1);
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setEmail("hamzasakali@gmail.com");
        etudiant2.setNom("sakali");
        etudiant2.setPrenom("hamza");
        etudiant2.setTelephone("0610223344");
        etudiant2.setClasse(classeLicence);
        etudiantRepository.save(etudiant2);
    }
}
