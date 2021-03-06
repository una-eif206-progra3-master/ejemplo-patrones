package cr.una.pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import cr.una.pattern.facade.RobotFacade;
import cr.una.pattern.singleton.MakeACaptain;
import cr.una.pattern.template.BasicEngineering;
import cr.una.pattern.template.ComputerScience;
import cr.una.pattern.template.Electronics;

/**
 *
 * @author mguzmana
 */
public class PatternsJUnitTest {

    public PatternsJUnitTest() {
    }

    @Test
    public void testSingletonPattern() {
        System.out.println();
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain captain1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeACaptain captain2 = MakeACaptain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("c1 and c2 are same instance");
        }

        assertNotNull(captain1);
        assertNotNull(captain2);
        assertEquals(captain1, captain2);
    }

    @Test
    public void testFacade() {
        System.out.println();
        System.out.println("***Facade Pattern Demo***");
        RobotFacade rf1 = new RobotFacade();
        rf1.ConstructRobot("Green", "Iron");
        RobotFacade rf2 = new RobotFacade();
        rf2.ConstructRobot("Blue", "Steel");

        assertNotNull(rf1);
        assertNotNull(rf2);
    }

    @Test
    public void testTemplateMethod() {
        System.out.println();
        System.out.println("***Template Method Pattern Demo***\n");

        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Sc  Papers:");
        bs.Papers();
        assertNotNull(bs);
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics Papers:");
        bs.Papers();
        assertNotNull(bs);
    }
}
