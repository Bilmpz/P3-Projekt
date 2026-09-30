package com.cendoAiAgentAnalysis.backend.repository;

import com.cendoAiAgentAnalysis.backend.model.TestNode; //Import the testnode class
import org.springframework.data.neo4j.repository.Neo4jRepository; //Imports the built in reposetory functions(database function, save(), findAll())

//Overall we tell Spring that we need a reposetory that works with TestNode
// TestNodeReposetory inherets functionality from Neo4jRepository
//Syntax: Neo4jRepository<Object, the variable type the id is>
//Neo4jRepository<TestNode, String> = Create a Neo4j repository for TestNodes where their IDs are Strings
public interface TestNodeRepository extends Neo4jRepository<TestNode, String> {
}