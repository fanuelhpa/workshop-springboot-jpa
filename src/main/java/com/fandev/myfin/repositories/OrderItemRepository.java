package com.fandev.myfin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.myfin.entities.OrderItem;
import com.fandev.myfin.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
