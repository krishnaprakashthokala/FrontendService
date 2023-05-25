package org.ecommerce.frontendservice.dto;

import org.springframework.ui.Model;

public class CartControllerAddInDTO {
    private Long productLineId;
    private Model model;
    
    
    public Long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}