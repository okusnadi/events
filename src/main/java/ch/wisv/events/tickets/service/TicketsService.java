package ch.wisv.events.tickets.service;

import ch.wisv.events.core.exception.normal.OrderInvalidException;
import ch.wisv.events.core.exception.normal.PaymentsStatusUnknown;
import ch.wisv.events.core.model.order.Customer;
import ch.wisv.events.core.model.order.Order;

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
public interface TicketsService {

    /**
     * Get the Customer that is currently logged in.
     *
     * @return Customer
     */
    Customer getCurrentCustomer();

    /**
     * Get a Mollie Url via the Payments API.
     *
     * @param order of type Order
     * @return String
     */
    String getPaymentsMollieUrl(Order order);

    /**
     * Update the status of the Order via the Payments API.
     *  @param order             of type Order
     * @param paymentsReference of type String
     */
    void updateOrderStatus(Order order, String paymentsReference) throws PaymentsStatusUnknown, OrderInvalidException;
}
