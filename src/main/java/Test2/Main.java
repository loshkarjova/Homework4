package Test2;

import Test2.barrier.Racetrack;
import Test2.barrier.Wall;
import Test2.participant.Cat;
import Test2.participant.IOvercome;
import Test2.participant.Participant;
import Test2.participant.Person;
import Test2.participant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant cat = new Cat("Tom", 200, 4);
        Participant person = new Person("Leonid", 50, 3);
        Participant robot = new Robot("IRobot", 1000, 5);

        IOvercome wall = new Wall(3);
        IOvercome racetrack = new Racetrack(200);
        IOvercome[] overcomes = {wall, racetrack, wall};
        //String overcome = wall.overcome();

        Participant[] participants = {cat, person, robot};
        for (Participant participant : participants) {
            for (IOvercome overcome : overcomes) {
                if (overcome.overcome(participant).isOvercome()) {
                    System.out.println(participant.getName() + " не прошел преграду " + overcome.getBarrierName() +
                                       " на дистанции " + overcome.overcome(participant).getBarrierValue() + " м ");
                    break;
                    //System.out.println(overcomes[j].overcome(participants[i]));
                } else {
                    System.out.println(participant.getName() + "  прошел преграду " + overcome.getBarrierName() +
                                       " на дистанции " + overcome.overcome(participant).getBarrierValue() + " м ");

                }

            }

        }


    }
}
