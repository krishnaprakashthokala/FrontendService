package org.ecommerce.frontendservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.frontendservice.dto.*;
import org.ecommerce.web.services.impl.CartServiceImpl;

@RestController
@RequestMapping("/cartServiceImpl")
public class CartServiceImplController {
    @Autowired
    private CartServiceImpl cartServiceImpl;

    @PostMapping(value = "/getAllItem", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartServiceImplGetAllItemOutDTO> getAllItem(@RequestBody CartServiceImplGetAllItemInDTO in) {
        CartServiceImplGetAllItemOutDTO ret = new CartServiceImplGetAllItemOutDTO();
        ret.setRetVal(cartServiceImpl.getAllItem());
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/isEmpty", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CartServiceImplIsEmptyOutDTO> isEmpty(@RequestBody CartServiceImplIsEmptyInDTO in) {
        CartServiceImplIsEmptyOutDTO ret = new CartServiceImplIsEmptyOutDTO();
        ret.setRetVal(cartServiceImpl.isEmpty());
        return ResponseEntity.ok(ret);
    }

}