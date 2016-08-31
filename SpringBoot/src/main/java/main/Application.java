package main;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(
    scanBasePackages = {
//        "com.autodesk.cp.config",
//        "com.autodesk.cp.utils",
//        "com.autodesk.cp.controllers",
//        "com.autodesk.cp.services",
//        "com.autodesk.cp.filters",
//        "com.autodesk.cp.repositories",
//        "com.autodesk.cp.providers",
//        "com.autodesk.cp.repositories.v1.couchbase"
    }
)
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
    	System.err.println("this is test");

    }
}
