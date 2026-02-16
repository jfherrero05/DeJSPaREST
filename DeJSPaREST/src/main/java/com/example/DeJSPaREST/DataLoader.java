package com.example.DeJSPaREST;


import com.example.DeJSPaREST.model.Criterio;
import com.example.DeJSPaREST.model.Materia;
import com.example.DeJSPaREST.model.Ra;
import com.example.DeJSPaREST.repository.CriterioRepository;
import com.example.DeJSPaREST.repository.MateriaRepository;
import com.example.DeJSPaREST.repository.RaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MateriaRepository materiaRepository;
    private final RaRepository raRepository;
    private final CriterioRepository criterioRepository;

    public DataLoader(MateriaRepository materiaRepository, RaRepository raRepository, CriterioRepository criterioRepository) {
        this.materiaRepository = materiaRepository;
        this.raRepository = raRepository;
        this.criterioRepository = criterioRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Creamos la Materia
        Materia m1 = new Materia();
        m1.setNombre("Desarrollo Interfaces");
        m1.setCurso("2 DAM");
        m1.setHoras(120);
        materiaRepository.save(m1);

        // 2. Creamos el RA vinculado a la materia
        Ra ra1 = new Ra();
        ra1.setDescripcion("RA1: Crea interfaces gráficas");
        ra1.setPonderacion(30.0);
        ra1.setMateria(m1); // <--- Enlazamos
        raRepository.save(ra1);

        // 3. Creamos el Criterio vinculado al RA
        Criterio c1 = new Criterio();
        c1.setCodigo("a)");
        c1.setDescripcion("Utiliza componentes visuales estándar.");
        c1.setRa(ra1); // <--- Enlazamos
        criterioRepository.save(c1);

        System.out.println("✅ ¡Datos de prueba cargados con éxito!");
    }
}