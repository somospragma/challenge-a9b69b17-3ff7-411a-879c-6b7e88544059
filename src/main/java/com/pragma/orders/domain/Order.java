package com.pragma.orders.domain;

public record Order(String customerId, String itemId, int quantity) {
}