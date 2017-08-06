package pl.thewalkingcode.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
class BaseEntity implements Serializable {

    @Id
    @org.hibernate.annotations.GenericGenerator(
            name = "id_generator",
            strategy = "enhanced-sequence",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "sequence_name",
                            value = "jpa_recruiter_seq"
                    ),
                    @org.hibernate.annotations.Parameter(
                            name = "initial_value",
                            value = "100"
                    )
            }
    )
    private Long id;

    @Column
    private String uuid = UUID.randomUUID().toString();

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public boolean equals(Object o) {
        return this == o || o instanceof BaseEntity &&
                Objects.equals(uuid, ((BaseEntity) o).uuid);
    }

}
