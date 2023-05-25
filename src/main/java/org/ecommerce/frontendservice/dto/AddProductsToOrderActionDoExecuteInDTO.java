package org.ecommerce.frontendservice.dto;

import org.springframework.webflow.execution.RequestContext;

public class AddProductsToOrderActionDoExecuteInDTO {
    private RequestContext context;
    
    
    public RequestContext getContext() {
        return context;
    }

    public void setContext(RequestContext context) {
        this.context = context;
    }
    
}