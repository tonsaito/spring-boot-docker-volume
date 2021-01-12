package com.tonsaito.sb.docker.volume;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public SampleModel sample(){
        return new SampleModel("Up and running!");
    }
}
