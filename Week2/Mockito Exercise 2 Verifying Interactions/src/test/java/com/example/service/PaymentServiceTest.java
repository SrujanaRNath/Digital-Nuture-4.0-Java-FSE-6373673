package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class PaymentServiceTest {

    @Test
    void shouldVerifyInteractionWithMock() {
        PaymentGateway mockGateway = mock(PaymentGateway.class);
        PaymentService service = new PaymentService(mockGateway);

        service.processPayment("user123", 100.0);

        verify(mockGateway).charge("user123", 100.0); // Verify interaction
    }
}
