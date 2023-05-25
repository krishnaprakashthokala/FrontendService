package org.ecommerce.frontendservice.dto;

import org.springframework.ui.Model;

public class CartControllerShowInDTO {
    private Model model;
    
    
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
}