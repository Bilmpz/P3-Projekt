package com.cendoAiAgentAnalysis.backend.model;

import org.springframework.data.neo4j.core.schema.Id; //Imports the id annotation from spring data Neo4j. Id is the identifier of the nodes
import org.springframework.data.neo4j.core.schema.Node; //Node annotation. Spring dataNeo4j knows this java class represents a Neo4j node

@Node("TestNode") // the java class represents a Neo4j node that has the label TestNode
public class TestNode { //Creates a regular java class

    @Id //The imported Id notation. It marks the next variable as the nodes id
    private String id;
    private String message;

    //Constructor: a node can be created without being given any values
    public TestNode() { }

    //Constructor: cretes a node with valuees
    public TestNode(String id, String message) {
        this.id = id;
        this.message = message;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
}