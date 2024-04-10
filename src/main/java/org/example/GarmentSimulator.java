package org.example;

public class GarmentSimulator {

    // Abstract Product: Top
    interface Top {
        String getType();
    }

    // Concrete Products
    static class CasualTop implements Top {
        @Override
        public String getType() {
            return "Casual Top";
        }
    }

    static class PartyTop implements Top {
        @Override
        public String getType() {
            return "Party Top";
        }
    }

    static class ProfessionalTop implements Top {
        @Override
        public String getType() {
            return "Professional Top";
        }
    }

    // Abstract Product: Pants
    interface Pants {
        String getType();
    }

    // Concrete Products
    static class CasualPants implements Pants {
        @Override
        public String getType() {
            return "Casual Pants";
        }
    }

    static class PartyPants implements Pants {
        @Override
        public String getType() {
            return "Party Pants";
        }
    }

    static class ProfessionalPants implements Pants {
        @Override
        public String getType() {
            return "Professional Pants";
        }
    }

    // Abstract Product: Shoes
    interface Shoes {
        String getType();
    }

    // Concrete Products
    static class CasualShoes implements Shoes {
        @Override
        public String getType() {
            return "Casual Shoes";
        }
    }

    static class PartyShoes implements Shoes {
        @Override
        public String getType() {
            return "Party Shoes";
        }
    }

    static class ProfessionalShoes implements Shoes {
        @Override
        public String getType() {
            return "Professional Shoes";
        }
    }

    // Abstract Factory
    interface GarmentFactory {
        Top createTop();

        Pants createPants();

        Shoes createShoes();
    }

    // Concrete Factories
    static class CasualGarmentFactory implements GarmentFactory {
        @Override
        public Top createTop() {
            return new CasualTop();
        }

        @Override
        public Pants createPants() {
            return new CasualPants();
        }

        @Override
        public Shoes createShoes() {
            return new CasualShoes();
        }
    }

    static class PartyGarmentFactory implements GarmentFactory {
        @Override
        public Top createTop() {
            return new PartyTop();
        }

        @Override
        public Pants createPants() {
            return new PartyPants();
        }

        @Override
        public Shoes createShoes() {
            return new PartyShoes();
        }
    }

    static class ProfessionalGarmentFactory implements GarmentFactory {
        @Override
        public Top createTop() {
            return new ProfessionalTop();
        }

        @Override
        public Pants createPants() {
            return new ProfessionalPants();
        }

        @Override
        public Shoes createShoes() {
            return new ProfessionalShoes();
        }
    }
}
