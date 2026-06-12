package org.example.lab8_20223291.service;


import org.example.lab8_20223291.dto.EquipoListDTO;
import org.example.lab8_20223291.repository.EquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class equipoService {

    private final EquipoRepository equipoRepository;

    public equipoService(EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;

    }

    public List<EquipoListDTO> listarTodos() {

        return EquipoRepository.findAll()
                .stream()
                .map(this::toListDTO)
                .collect(Collectors.toList());
    }


}
