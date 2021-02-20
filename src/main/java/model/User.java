package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "is_moderator", nullable = false, columnDefinition = "TINYINT")
    private boolean isModerator = false;

    @Column(name = "reg_time", nullable = false)
    private Instant regTime;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    private String code;

    @Column(name = "photo", columnDefinition = "text")
    private String photoURL;
}
