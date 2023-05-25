package org.ecommerce.frontendservice.dto;

import java.util.Set;
import org.ecommerce.web.models.shop.CartItem;

public class CartServiceImplGetAllItemOutDTO {
    private Set<CartItem> retVal;
    
    
    public Set<CartItem> getRetVal() {
        return retVal;
    }

    public void setRetVal(Set<CartItem> retVal) {
        this.retVal = retVal;
    }
    
}