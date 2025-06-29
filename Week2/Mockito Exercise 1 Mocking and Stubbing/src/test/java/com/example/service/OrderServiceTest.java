package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void shouldReturnTrueWhenProductIsInStock() {
        InventoryService mockInventory = mock(InventoryService.class);
        when(mockInventory.isInStock("prod123", 2)).thenReturn(true);

        OrderService service = new OrderService(mockInventory);
        boolean result = service.placeOrder("prod123", 2);

        assertTrue(result);
        verify(mockInventory).remove("prod123", 2);
    }

    @Test
    void shouldReturnFalseWhenProductIsNotInStock() {
        InventoryService mockInventory = mock(InventoryService.class);
        when(mockInventory.isInStock("prod123", 2)).thenReturn(false);

        OrderService service = new OrderService(mockInventory);
        boolean result = service.placeOrder("prod123", 2);

        assertFalse(result);
        verify(mockInventory, never()).remove("prod123", 2);
    }
}
