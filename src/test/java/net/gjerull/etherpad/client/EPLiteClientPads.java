// Generated by GraphWalker (http://www.graphwalker.org)
package net.gjerull.etherpad.client;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "net/gjerull/etherpad/client/EPLiteClientPads.graphml")
public interface EPLiteClientPads {

    @Vertex()
    void NoExistePad();

    @Edge()
    void getText();

    @Edge()
    void deletePad();

    @Vertex()
    void ExistePad();

    @Edge()
    void setUp();

    @Edge()
    void createPad();

    @Edge()
    void setText();
}
