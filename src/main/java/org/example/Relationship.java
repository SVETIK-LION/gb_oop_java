package org.example;

public class Relationship {
    private int idRelationship;
    private int idPerson1;
    private int idPerson2;
    private int idRelarionType;
    private String nameRelationType;


    public Relationship(int idRelationship, int idPerson1, int idPerson2, int idRelarionType, String nameRelationType){
        this.idRelationship = idRelationship;
        this.idPerson1 = idPerson1;
        this.idPerson2 = idPerson2;
        this.idRelarionType = idRelarionType;
        this.nameRelationType = nameRelationType;
    }
}
