package com.javarestaurantcms.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Infos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String restaurant_name;

    private String restaurant_adresse;

    private String primary_color;

    private String email;

    private String password;

    private Boolean is_configured;

    private LocalDateTime created_at;

    public Infos(String restaurant_name, String restaurant_adresse, String primary_color, String email, String password) {
        this.restaurant_name = restaurant_name;
        this.restaurant_adresse = restaurant_adresse;
        this.primary_color = primary_color;
        this.email = email;
        this.password = password;
        this.created_at = LocalDateTime.now();
        this.is_configured = Boolean.FALSE;
    }
    public Infos(){}
}
