package org.javajarvis.SistemCuti_UASJava.controller;

import org.javajarvis.SistemCuti_UASJava.model.PengajuanCuti;
import org.javajarvis.SistemCuti_UASJava.model.StatusCuti;
import org.javajarvis.SistemCuti_UASJava.repository.PengajuanCutiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pengajuancuti")
public class PengajuanCutiController {

    @Autowired
    private PengajuanCutiRepository repo;

    @PostMapping
    public PengajuanCuti save(@RequestBody PengajuanCuti pengajuanCuti){
        return repo.save(pengajuanCuti);
    }

    @PutMapping
    public PengajuanCuti update(@RequestBody PengajuanCuti pengajuanCuti){
        return  repo.save(pengajuanCuti);
    }

    @DeleteMapping
    public void delete(@RequestBody Integer id){
        repo.deleteById(id);
    }

    @GetMapping
    public Iterable<PengajuanCuti> findAll(){
        return repo.findAll();
    }


}
