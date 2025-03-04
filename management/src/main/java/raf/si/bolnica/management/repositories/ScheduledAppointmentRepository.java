package raf.si.bolnica.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raf.si.bolnica.management.entities.ZakazaniPregled;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface ScheduledAppointmentRepository extends JpaRepository<ZakazaniPregled, Long> {
            ZakazaniPregled getZakazaniPregledByZakazaniPregledId(long id);
            List<ZakazaniPregled> findByLbzLekaraAndAndDatumIVremePregleda(UUID lbzLekara, Timestamp datumIVremePregleda);
            Optional<ZakazaniPregled> findByLbzLekaraAndDatumIVremePregledaBetween(UUID lbzLekara, Timestamp datumStart, Timestamp datumEnd);
            List<ZakazaniPregled> findByLbzLekara(UUID lbzLekara);

}
