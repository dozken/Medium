package com.medium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class AppController {
    @Autowired
    private AppService service;

    @Autowired
    private AppModelResourceAssembler assembler;

    @GetMapping()
    public Resource<AppModel> get() {
        AppModel model = service.findById(1L).orElseThrow(() -> new RuntimeException("Not found"));
        return assembler.toResource(model);
    }
}
