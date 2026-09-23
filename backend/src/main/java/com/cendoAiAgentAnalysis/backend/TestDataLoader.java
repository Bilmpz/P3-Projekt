package com.cendoAiAgentAnalysis.backend;

import com.cendoAiAgentAnalysis.backend.model.TestNode;
import com.cendoAiAgentAnalysis.backend.repository.TestNodeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataLoader implements CommandLineRunner {

    private final TestNodeRepository repository;

    public TestDataLoader(TestNodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        TestNode node = new TestNode(
                "test-1",
                "Hello from Cendo!"
        );

        repository.save(node);

        System.out.println("=================================");
        System.out.println("TEST NODE CREATED IN NEO4J!");
        System.out.println("=================================");
    }
}