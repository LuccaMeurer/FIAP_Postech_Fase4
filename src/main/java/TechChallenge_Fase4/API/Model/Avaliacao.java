package TechChallenge_Fase4.API.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Integer nota;

    private LocalDateTime dataEnvio;

    @PrePersist
    public void prePersist() {
        this.dataEnvio = LocalDateTime.now();
    }
}