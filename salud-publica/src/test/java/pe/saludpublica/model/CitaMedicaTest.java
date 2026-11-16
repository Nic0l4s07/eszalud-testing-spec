package pe.saludpublica.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CitaMedicaTest {

    private static final LocalDateTime FECHA = LocalDateTime.of(2026, 12, 1, 10, 30);

    @Test
    @DisplayName("CIT-001: Crear una cita medica con datos validos")
    void shouldCreateAppointmentWithValidData() {
        CitaMedica cita = new CitaMedica("pac-1", "doc-1", "esp-1", FECHA, "Control general", EstadoCita.PROGRAMADA);

        assertNotNull(cita);
        assertEquals("pac-1", cita.getPaciente());
        assertEquals("doc-1", cita.getDoctor());
        assertEquals("esp-1", cita.getEspecialidad());
        assertEquals(FECHA, cita.getFechaHora());
        assertEquals("Control general", cita.getMotivo());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }
    @Test
    @DisplayName("CIT-002: Rechazar la creacion de una cita sin paciente")
    void shouldRejectAppointmentWithoutPatient() {
        assertThrows(IllegalArgumentException.class,
            () -> new CitaMedica(null, "doc-1", "esp-1", FECHA, "Control general", EstadoCita.PROGRAMADA));
    }
}
