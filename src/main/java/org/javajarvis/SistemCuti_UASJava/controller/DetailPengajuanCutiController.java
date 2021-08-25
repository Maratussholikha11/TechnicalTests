package org.javajarvis.SistemCuti_UASJava.controller;

import org.javajarvis.SistemCuti_UASJava.model.DetailPengajuanCuti;
import org.javajarvis.SistemCuti_UASJava.model.PengajuanCuti;
import org.javajarvis.SistemCuti_UASJava.repository.DetailPengajuanCutiRepository;
import org.javajarvis.SistemCuti_UASJava.repository.PengajuanCutiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detailpengajuancuti")
public class DetailPengajuanCutiController {

    @Autowired
    private DetailPengajuanCutiRepository repo;

    @PostMapping
    public DetailPengajuanCuti save(@RequestBody DetailPengajuanCuti detailPengajuanCuti){
        return repo.save(detailPengajuanCuti);
    }

    @PutMapping
    public DetailPengajuanCuti update(@RequestBody DetailPengajuanCuti detailPengajuanCuti){
        return  repo.save(detailPengajuanCuti);
    }

    @DeleteMapping
    public void delete(@RequestBody Integer id){
        repo.deleteById(id);
    }

    @GetMapping
    public Iterable<DetailPengajuanCuti> findAll(){
        return repo.findAll();
    }

}
