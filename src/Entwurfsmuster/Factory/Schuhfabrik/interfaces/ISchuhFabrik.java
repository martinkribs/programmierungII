package Entwurfsmuster.Factory.Schuhfabrik.interfaces;

public interface ISchuhFabrik {
    ISchuh createSchuh(String name);
}