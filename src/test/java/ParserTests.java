import org.junit.Test;

import domain.State;
import parser.VisitorOrientedParser;

public class ParserTests {

    @Test
    public void test_final_state() {
        String stateStr = "/\\\\ postcond = TRUE"
            + "/\\\\ f = TRUE"
            + "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 2] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, a |-> 1, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, a |-> 1, ts |-> {}] )"
            + "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )";

        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        assert(state.isFinalState());
    }
}
