package ch.wisv.events.scan.service;

import ch.wisv.events.core.exception.normal.SoldProductNotFoundException;
import ch.wisv.events.core.model.order.Customer;
import ch.wisv.events.core.model.order.SoldProduct;
import ch.wisv.events.core.model.product.Product;
import ch.wisv.events.scan.object.ScanResult;

import java.util.List;

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
public interface ScanAppSoldProductService {

    /**
     * Method getAllByProductAndCustomer ...
     *
     * @param product  of type Product
     * @param customer of type Customer
     * @return List<SoldProduct>
     */
    List<SoldProduct> getAllByProductAndCustomer(Product product, Customer customer);

    /**
     * Method getByProductAndUniqueCode ...
     *
     * @param product    of type Product
     * @param uniqueCode of type String
     * @return SoldProduct
     */
    SoldProduct getByProductAndUniqueCode(Product product, String uniqueCode) throws SoldProductNotFoundException;

    /**
     * Method scanByProductAndUniqueCode ...
     *
     * @param product    of type Product
     * @param uniqueCode of type String
     * @return ScanResult
     */
    ScanResult scanByProductAndUniqueCode(Product product, String uniqueCode);

    /**
     * Method scanProductWithRfid ...
     *
     * @param product  of type Product
     * @param customer of type String
     * @return ScanResult
     */
    ScanResult scanByProductAndCustomer(Product product, Customer customer);

    /**
     * Method scanSoldProduct ...
     *
     * @param soldProduct of type SoldProduct
     * @return ScanResult
     */
    ScanResult scanSoldProduct(SoldProduct soldProduct);
}
