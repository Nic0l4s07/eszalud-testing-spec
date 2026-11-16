package pe.saludpublica.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoctorTest {

    @Test
    @DisplayName("DOC-001: Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor doctor = new Doctor("40123456", "Carlos", "Ruiz", "CMP12345", "esp-cardiologia");

        assertNotNull(doctor);
        assertEquals("40123456", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Ruiz", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("esp-cardiologia", doctor.getEspecialidad());
    }
}
