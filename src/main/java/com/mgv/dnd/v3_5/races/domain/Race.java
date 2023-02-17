package com.mgv.dnd.v3_5.races.domain;

import com.mgv.dnd.v3_5.races.domain.vo.*;

import java.util.List;

public final class Race {
    private final RaceId id;
    private final RaceName name;
    private final RaceDescription description;
    private final RaceSize size;
    private final RaceSpeed speed;
    private final List<RaceLanguage> languages;
    private final List<RaceModifier> modifiers;
    private final List<RaceCharacteristic> characteristics;

    public Race(RaceId id, RaceName name, RaceDescription description, RaceSize size, RaceSpeed speed, List<RaceLanguage> languages,
                List<RaceModifier> modifiers, List<RaceCharacteristic> characteristics) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.speed = speed;
        this.languages = languages;
        this.modifiers = modifiers;
        this.characteristics = characteristics;
    }

    public static Race create(RaceId id, RaceName name, RaceDescription description, RaceSize size, RaceSpeed speed, List<RaceLanguage> languages,
                              List<RaceModifier> modifiers, List<RaceCharacteristic> characteristics){
        return new Race(id, name, description, size, speed, languages, modifiers, characteristics);
    }

    public RaceId id() {
        return id;
    }

    public RaceName name() {
        return name;
    }

    public RaceDescription description() {
        return description;
    }

    public RaceSize size() {
        return size;
    }

    public RaceSpeed speed() {
        return speed;
    }

    public List<RaceLanguage> languages() {
        return languages;
    }

    public List<RaceModifier> modifiers() {
        return modifiers;
    }

    public List<RaceCharacteristic> characteristics() {
        return characteristics;
    }

    public void addLanguage(RaceLanguage language){
        this.languages.add(language);
    }

    public void addCharacteristic(RaceCharacteristic characteristic){
        this.characteristics.add(characteristic);
    }

    public void addModifier(RaceModifier modifier){
        this.modifiers.add(modifier);
    }

    public void removeLanguage(RaceLanguage language){
        this.languages.remove(language);
    }

    public void removeCharacteristic(RaceCharacteristic characteristic){
        this.characteristics.remove(characteristic);
    }

    public void removeModifier(RaceModifier modifier){
        this.modifiers.remove(modifier);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Race race = (Race) obj;
        return id.equals(race.id) && name.equals(race.name) && description.equals(race.description) && size.equals(race.size) && speed.equals(race.speed)
                && languages.equals(race.languages) && modifiers.equals(race.modifiers) && characteristics().equals(race.characteristics);
    }
}
