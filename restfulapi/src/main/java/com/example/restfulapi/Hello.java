package com.example.restfulapi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, I am text";
    }

    @POST
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello, I am XML!" + "</hello>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHTMLHello() {
        return "<html>" + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello, I am html!" + "</h1></body></html>";
    }

}
