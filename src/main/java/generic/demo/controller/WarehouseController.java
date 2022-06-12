package generic.demo.controller;

import generic.demo.models.warehouse.*;
import generic.demo.service.WarehouseService;
import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/warehouse")
@Api("Controller for warehouse")
public class WarehouseController extends AbstractController<WarehouseGetDTO, WarehousePostDTO, WarehousePutDTO, WarehousePostedDTO, WarehouseUpdatedDTO, WarehouseService>{
    public WarehouseController(WarehouseService service) {
        super(service);
    }
}
