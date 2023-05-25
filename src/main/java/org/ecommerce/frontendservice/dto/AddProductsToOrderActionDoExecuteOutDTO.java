package org.ecommerce.frontendservice.dto;

import org.springframework.webflow.execution.Event;

public class AddProductsToOrderActionDoExecuteOutDTO {
    private Event retVal;
    
    
    public Event getRetVal() {
        return retVal;
    }

    public void setRetVal(Event retVal) {
        this.retVal = retVal;
    }
    
}