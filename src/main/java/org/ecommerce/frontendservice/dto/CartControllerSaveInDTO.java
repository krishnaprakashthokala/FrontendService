package org.ecommerce.frontendservice.dto;

import org.ecommerce.web.models.shop.Cart;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.support.SessionStatus;

public class CartControllerSaveInDTO {
    private Cart cart;
    private BindingResult bindingResult;
    private RedirectAttributes model;
    private SessionStatus sessionStatus;
    
    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
    
    public RedirectAttributes getModel() {
        return model;
    }

    public void setModel(RedirectAttributes model) {
        this.model = model;
    }
    
    public SessionStatus getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }
    
}