package com.cendoAiAgentAnalysis.backend.repository;

import com.cendoAiAgentAnalysis.backend.model.TestNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TestNodeRepository extends Neo4jRepository<TestNode, String> {
}