package com.example.service;

public class OrderService {
    private final InventoryService inventoryService;

    public OrderService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean placeOrder(String productId, int quantity) {
        if (inventoryService.isInStock(productId, quantity)) {
            inventoryService.remove(productId, quantity);
            return true;
        }
        return false;
    }
}

interface InventoryService {
    boolean isInStock(String productId, int quantity);
    void remove(String productId, int quantity);
}
