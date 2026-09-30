package com.cendoAiAgentAnalysis.backend;

//This is just a test that automatically runs when the application starts so we can test if the database connection works.

import com.cendoAiAgentAnalysis.backend.model.TestNode;
import com.cendoAiAgentAnalysis.backend.repository.TestNodeRepository;
import org.springframework.boot.CommandLineRunner; //This allows Spring to run a command right when the application starts
import org.springframework.stereotype.Component; //Component annotation

@Component //Registers the class with Spring, allows Spring to find it
public class TestDataLoader implements CommandLineRunner { // CommandLineRunner has a method run() we need to implement.

    //Gives the class acces to the reposetory for TestNode, so we can use the database methods. Final = we do not replase the reposetory later
    private final TestNodeRepository repository;

    //Constructor - Because we use @Component Spring manages this class. That is also why we do not create a testDataLoader opbject ouerselvs.
    // Spring ses when it creates the object that it needs a TestNodeReposetory, then it finds our reposetory and injects it (dependency injection)
    public TestDataLoader(TestNodeRepository repository) {
        this.repository = repository;
    }

    @Override //Need to override the finction that originally is in CommandLineRunner
    public void run(String... args) { //run() is run by Spring when the application starts

        TestNode node = new TestNode(
                "test-1",
                "Hello from Cendo!"
        );

        //The database functionallity we got from extending the Neo4jRepository
        repository.save(node);

        System.out.println("=================================");
        System.out.println("TEST NODE CREATED IN NEO4J!");
        System.out.println("=================================");
    }
}