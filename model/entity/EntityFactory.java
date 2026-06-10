package model.entity;

public abstract class EntityFactory<Object, Name> {
    public abstract Object create(Name name);
}