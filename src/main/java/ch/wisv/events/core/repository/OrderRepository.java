package ch.wisv.events.core.repository;

import ch.wisv.events.core.model.order.Customer;
import ch.wisv.events.core.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

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
public interface OrderRepository extends JpaRepository<Order, Integer> {

    /**
     * Method findByPublicReference find Order by public reference.
     *
     * @param publicReference of type String
     * @return Optional<Order>
     */
    Optional<Order> findByPublicReference(String publicReference);

    /**
     * Method findByCustomer find Order by Customer.
     *
     * @param customer of type Customer
     * @return List<Order>
     */
    List<Order> findByCustomer(Customer customer);

}
