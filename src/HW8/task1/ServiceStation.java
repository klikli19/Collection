package HW8.task1;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<S extends Transport>{

    private Queue<S> transports = new LinkedList<>();

    public void addTransport(S transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусам диагностика не нужна");
        } else {
            transports.add(transport);
        }
    }

    public void carryOutTechnicalInspection () throws CantDiagnosticException {
        while (!transports.isEmpty()) {
            S transport = transports.poll();
            System.out.println("Проводится техосмотр " + transport.getBrand() + " " + transport.getModel());
            if (transport.carryOutTechnicalInspection()) {
                transport.diagnostic();
            } else {
                System.out.println("Все исправно");
            }
        }
    }
}
