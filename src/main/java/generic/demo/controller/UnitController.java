package generic.demo.controller;

import generic.demo.models.unit.*;
import generic.demo.service.UnitService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/unit")
@Api("Controller for unit")
public class UnitController extends AbstractController<UnitGetDTO, UnitPostDTO, UnitPutDTO, UnitPostedDTO, UnitUpdatedDTO, UnitService>{
    public UnitController(UnitService service) {
        super(service);
    }
}
