package org.example;

public class Main {
    public static void main(String[] args) {
        // Create factories
        GarmentSimulator.GarmentFactory casualFactory = new GarmentSimulator.CasualGarmentFactory();
        GarmentSimulator.GarmentFactory partyFactory = new GarmentSimulator.PartyGarmentFactory();
        GarmentSimulator.GarmentFactory professionalFactory = new GarmentSimulator.ProfessionalGarmentFactory();

        // Create casual garments
        GarmentSimulator.Top casualTop = casualFactory.createTop();
        GarmentSimulator.Pants casualPants = casualFactory.createPants();
        GarmentSimulator.Shoes casualShoes = casualFactory.createShoes();

        // Create party garments
        GarmentSimulator.Top partyTop = partyFactory.createTop();
        GarmentSimulator.Pants partyPants = partyFactory.createPants();
        GarmentSimulator.Shoes partyShoes = partyFactory.createShoes();

        // Create professional garments
        GarmentSimulator.Top professionalTop = professionalFactory.createTop();
        GarmentSimulator.Pants professionalPants = professionalFactory.createPants();
        GarmentSimulator.Shoes professionalShoes = professionalFactory.createShoes();

        // Output
        System.out.println("Casual outfit:");
        System.out.println(casualTop.getType());
        System.out.println(casualPants.getType());
        System.out.println(casualShoes.getType());

        System.out.println("\nParty outfit:");
        System.out.println(partyTop.getType());
        System.out.println(partyPants.getType());
        System.out.println(partyShoes.getType());

        System.out.println("\nProfessional outfit:");
        System.out.println(professionalTop.getType());
        System.out.println(professionalPants.getType());
        System.out.println(professionalShoes.getType());
    }
}
