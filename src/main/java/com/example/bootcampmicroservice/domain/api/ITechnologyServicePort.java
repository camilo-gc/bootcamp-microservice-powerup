package com.example.bootcampmicroservice.domain.api;

import com.example.bootcampmicroservice.domain.model.TechnologyModel;

public interface ITechnologyServicePort {

    TechnologyModel saveTechnology(TechnologyModel technologyModel);

//    List<TechnologyModel> getAllTechnologies();

}