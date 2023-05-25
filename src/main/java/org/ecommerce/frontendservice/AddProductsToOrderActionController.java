package org.ecommerce.frontendservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.frontendservice.dto.*;
import org.ecommerce.web.frontend.flows.actions.AddProductsToOrderAction;

@RestController
@RequestMapping("/addProductsToOrderAction")
public class AddProductsToOrderActionController {
    @Autowired
    private AddProductsToOrderAction addProductsToOrderAction;

    @PostMapping(value = "/doExecute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AddProductsToOrderActionDoExecuteOutDTO> doExecute(@RequestBody AddProductsToOrderActionDoExecuteInDTO in) {
        AddProductsToOrderActionDoExecuteOutDTO ret = new AddProductsToOrderActionDoExecuteOutDTO();
        ret.setRetVal(addProductsToOrderAction.doExecute(in.getContext()));
        return ResponseEntity.ok(ret);
    }

}