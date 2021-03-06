package ch.wisv.events.core.model.order;

import ch.wisv.events.core.model.product.Product;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

/**
 * Copyright (c) 2016  W.I.S.V. 'Christiaan Huygens'
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
@Entity
@Data
public class SoldProduct {

    /**
     * ID of the sold product
     */
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Integer id;

    /**
     * Key of the sold product
     */
    private String key;

    @ManyToOne
    private Order order;

    /**
     * Product that is sold
     */
    @ManyToOne
    private Product product;

    /**
     * Customer who bought the product
     */
    @ManyToOne
    private Customer customer;

    /**
     * Field uniqueCode
     */
    private String uniqueCode;

    /**
     * Status of the sold product
     */
    private SoldProductStatus status;

    /**
     * Default constructor
     */
    public SoldProduct() {
        this.key = UUID.randomUUID().toString();
        this.status = SoldProductStatus.OPEN;
    }

    /**
     * Constructor SoldProduct creates a new SoldProduct instance.
     *
     * @param product  of type Product
     * @param order    of type Order
     * @param customer of type Customer
     */
    public SoldProduct(Product product, Order order, Customer customer) {
        this();
        this.order = order;
        this.product = product;
        this.customer = customer;
    }
}
