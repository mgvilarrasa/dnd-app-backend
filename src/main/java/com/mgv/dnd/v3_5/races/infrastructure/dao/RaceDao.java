package com.mgv.dnd.v3_5.races.infrastructure.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "races")
public class RaceDao {
    @Id
    private String id;
    private String name;
    private String description;
    private String size;
    private String speed;
    private String languages;
    private String characteristics;
    private String modifiers;

    public RaceDao() {
    }

    public RaceDao(String id, String name, String description, String size, String speed, String languages, String characteristics, String modifiers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.speed = speed;
        this.languages = languages;
        this.characteristics = characteristics;
        this.modifiers = modifiers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getModifiers() {
        return modifiers;
    }

    public void setModifiers(String modifiers) {
        this.modifiers = modifiers;
    }
}
