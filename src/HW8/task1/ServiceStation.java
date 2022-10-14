package HW8.task1;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<S extends Transport>{

    private Queue<S> queue = new LinkedList<>();

    public void addTransport(S transport) {
        queue.offer(transport);
    }

    public void carryOutTechnicalInspection() {
        S transport = queue.poll();
        if (transport != null){
            System.out.println("Провродится техосмотр " + transport.getBrand() + " " + transport.getModel());
            carryOutTechnicalInspection();
        } else {
            System.out.println("Все авто прошли техосмотр");

        }
    }
}
