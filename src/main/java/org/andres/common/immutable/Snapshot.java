package org.andres.common.immutable;

import java.util.ArrayList;

public final class Snapshot {
    private final ArrayList<Integer> data;

    public Snapshot(ArrayList<Integer> data) {
        this.data = new ArrayList<>(data);
    }

    public ArrayList<Integer> restore() {
        return new ArrayList<>(data);
    }

    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Snapshot snapshot = new Snapshot(list);

        list.addFirst(3);
        list = snapshot.restore();
        IO.println(list);   // It should log "[1,2]"
        list.add(4);
        list = snapshot.restore();
        IO.println(list);   // It should log "[1,2]"
    }
}
