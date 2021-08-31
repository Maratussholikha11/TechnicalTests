package org.javajarvis.SistemCuti_UASJava.controller;

import org.javajarvis.SistemCuti_UASJava.dto.PengajuanCutiDto;
import org.javajarvis.SistemCuti_UASJava.model.PengajuanCuti;
import org.javajarvis.SistemCuti_UASJava.model.StatusCuti;
import org.javajarvis.SistemCuti_UASJava.repository.EmployeeRepository;
import org.javajarvis.SistemCuti_UASJava.repository.PengajuanCutiRepository;
import org.javajarvis.SistemCuti_UASJava.repository.StatusCutiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pengajuancuti")
public class PengajuanCutiController {

    @Autowired
    private PengajuanCutiRepository repo;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private StatusCutiRepository statusCutiRepository;

    @PostMapping
    public PengajuanCuti save(@RequestBody PengajuanCutiDto pengajuanCutiDto){
        ModelMapper modelMapper = new ModelMapper();
        PengajuanCuti pengajuanCuti = modelMapper.map(pengajuanCutiDto, PengajuanCuti.class);
        pengajuanCuti.setEmployee(employeeRepository.getById(pengajuanCutiDto.getEmployeeId()));
        pengajuanCuti.setStatusCuti(statusCutiRepository.getById(pengajuanCutiDto.getStatusCutiId()));
        pengajuanCuti.setPengganti(employeeRepository.getById(pengajuanCutiDto.getPenggantiId()));
        pengajuanCuti.setHrd(employeeRepository.getById(pengajuanCutiDto.getHrdId()));
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
