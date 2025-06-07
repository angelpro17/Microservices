package org.anampa.springcloud.msvc.usuarios.models.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column()
    @NotBlank(message = "El campo nombre no puede ser vacio")// para validar el nombre que no debe estar vacio
    private String nombre;

    @NotBlank
    @Email
    @Column(unique=true)//porque se requiere un email unico
    private String email;

    @NotBlank
    @Column(unique=true)//porque se requiero un password unico
    private String password;

    //getters
    public Long getId(){return id;}
    public String getNombre(){return nombre;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}

    //setters
    public void setId(Long id){this.id=id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setEmail(String email){this.email = email;}
    public void setPassword(String password){this.password = password;}
}
