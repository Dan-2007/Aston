package org.example.task4.liveLock;

public class LiveLock {

    static class Spoon {
        private Diner owner;

        public Spoon(Diner owner) {
            this.owner = owner;
        }

        public Diner getOwner() {
            return owner;
        }

        public void setOwner(Diner owner) {
            this.owner = owner;
        }
    }

    static class Diner {
        private String name;
        private boolean isHungry;

        public Diner(String name) {
            this.name = name;
            this.isHungry = true;
        }

        public String getName() {
            return name;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void eatWith(Spoon spoon, Diner spouse) {
            while (isHungry) {
                // If I've got no spoon, I'm patiently waiting
                if (spoon.getOwner() != this) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }

                // Wow, I've gotta spoon! But I'm so polite that I'll give in to my husband/wife if he's hungry.
                if (spouse.isHungry()) {
                    System.out.println(name + ": Are you hungry, ma dear " + spouse.getName() + "? Here. Take the spoon");
                    spoon.setOwner(spouse);
                    continue; // I gave in, and I'm waiting for my husband/wife to eat.
                }

                // If my husband/wife is not hungry, then I can finally eat!
                System.out.println(name + ": I can finally eat!");
                isHungry = false;

                System.out.println(name + ": *eats with a spoon*");

                //After eating, I give the spoon to my husband/wife so that he can eat too (if he wants)
                spoon.setOwner(spouse);
            }
        }
    }

    public static void main(String[] args) {
        final Diner husband = new Diner("husband");
        final Diner wife = new Diner("wife");

        final Spoon spoon = new Spoon(husband);

        Thread husbandThread = new Thread(() -> husband.eatWith(spoon, wife));
        Thread wifeThread = new Thread(() -> wife.eatWith(spoon, husband));

        husbandThread.start();
        wifeThread.start();
    }
}
