package com.example.bootcampmicroservice.application.handler;

import com.example.bootcampmicroservice.application.dto.TechnologyRequestDto;

public interface ITechnologyHandler {

    void saveTechnology(TechnologyRequestDto technologyRequestDto);

//    List<TechnologyResponseDto> getAllTechnologies();

}