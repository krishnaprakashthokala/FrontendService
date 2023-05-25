package org.ecommerce.frontendservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.frontendservice.dto.*;
import org.ecommerce.web.frontend.controllers.CartController;

@RestController
@RequestMapping("/cartController")
public class CartControllerController {
    @Autowired
    private CartController cartController;

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartControllerAddOutDTO> add(@RequestBody CartControllerAddInDTO in) {
        CartControllerAddOutDTO ret = new CartControllerAddOutDTO();
        ret.setRetVal(cartController.add(in.getProductLineId(), in.getCartItem(), in.getBindingResult(), in.getModel(), in.getSessionStatus()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartControllerSaveOutDTO> save(@RequestBody CartControllerSaveInDTO in) {
        CartControllerSaveOutDTO ret = new CartControllerSaveOutDTO();
        ret.setRetVal(cartController.save(in.getCart(), in.getBindingResult(), in.getModel(), in.getSessionStatus()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartControllerShowOutDTO> show(@RequestBody CartControllerShowInDTO in) {
        CartControllerShowOutDTO ret = new CartControllerShowOutDTO();
        ret.setRetVal(cartController.show(in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartControllerAddOutDTO> add(@RequestBody CartControllerAddInDTO in) {
        CartControllerAddOutDTO ret = new CartControllerAddOutDTO();
        ret.setRetVal(cartController.add(in.getProductLineId(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

}