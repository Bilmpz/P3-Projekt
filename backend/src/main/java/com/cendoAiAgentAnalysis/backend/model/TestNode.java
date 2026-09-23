package com.cendoAiAgentAnalysis.backend.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("TestNode")
public class TestNode {

    @Id
    private String id;

    private String message;

    public TestNode() {
    }

    public TestNode(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}