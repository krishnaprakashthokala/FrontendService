package org.ecommerce.web.frontend.flows.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
import org.ecommerce.persistence.models.Order;
import org.ecommerce.persistence.models.OrderLine;
import org.ecommerce.web.models.shop.CartItem;
import org.ecommerce.web.services.CartService;

/**
 * Web Flow Action for add all products inside the cart to current order
 * 
 * @author sergio
 */
@Component
@Transactional
public class AddProductsToOrderAction extends AbstractAction {

	private static Logger logger = LoggerFactory.getLogger(AddProductsToOrderAction.class);

	@Autowired
	private CartService cartService;

	@Override
	protected Event doExecute(RequestContext context) throws Exception {
		try {
			Order order = (Order) context.getFlowScope().get("order");
			Double basePrice = 0.0;
			for (CartItem cartItem : cartService.getAllItem()) {
				OrderLine orderLine = new OrderLine();
				orderLine.setOrder(order);
				orderLine.setProductLine(cartItem.getProductLine());
				orderLine.setQuantity(cartItem.getQuantity());
				orderLine.setTotalPrice(cartItem.getTotalPrice());
				basePrice += cartItem.getTotalPrice() * cartItem.getQuantity();
			}
			order.setBasePrice(basePrice);
			order.setPurchasedPrice(basePrice + 3.0);
			logger.info(order.toString());
			// save the order again
			context.getFlowScope().put("order", order);
			return success();
		} catch (Exception e) {
			MessageContext messageContext = context.getMessageContext();
			MessageBuilder builder = new MessageBuilder();
			messageContext.addMessage(builder.error().code("frontend.checkout.add.products.to.cart.failed").build());
			e.printStackTrace();
			return error();
		}
	}

}
