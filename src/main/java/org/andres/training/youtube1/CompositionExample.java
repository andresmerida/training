package org.andres.training.youtube1;

import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Realme6", "8GB", "128GB");
        Mobile mobile2 = new Mobile("SANSUNG A21S", "4GB", "128");
        Mobile mobile3 = new Mobile("SANSUNG M10", "4GB", "64GB");
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(mobile1);
        mobileList.add(mobile2);
        mobileList.add(mobile3);

        MobileStore store = new MobileStore(mobileList);
        for (Mobile mobile : store.getMobiles()) {
            System.out.println("Name: " + mobile.name + ", RAM: " + mobile.ram + ", and ROM: " + mobile.rom);
        }
    }

    static class Mobile {
        public String name;
        public String ram;
        public String rom;

        public Mobile(String name, String ram, String rom) {
            this.name = name;
            this.ram = ram;
            this.rom = rom;
        }
    }

    static class MobileStore {
        private final List<Mobile> mobiles;

        MobileStore(List<Mobile> mobiles) {
            this.mobiles = mobiles;
        }

        public List<Mobile> getMobiles() {
            return mobiles;
        }
    }
}
