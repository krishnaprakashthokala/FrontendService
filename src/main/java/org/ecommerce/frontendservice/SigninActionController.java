package org.ecommerce.frontendservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.frontendservice.dto.*;
import org.ecommerce.web.frontend.flows.actions.SigninAction;

@RestController
@RequestMapping("/signinAction")
public class SigninActionController {
    @Autowired
    private SigninAction signinAction;

    @PostMapping(value = "/doExecute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SigninActionDoExecuteOutDTO> doExecute(@RequestBody SigninActionDoExecuteInDTO in) {
        SigninActionDoExecuteOutDTO ret = new SigninActionDoExecuteOutDTO();
        ret.setRetVal(signinAction.doExecute(in.getContext()));
        return ResponseEntity.ok(ret);
    }

}