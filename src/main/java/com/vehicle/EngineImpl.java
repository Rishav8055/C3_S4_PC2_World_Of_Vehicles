package com.vehicle;

public class EngineImpl {
    public static void main(String[] args) {
      Icengine icengine = new Icengine("xuv123",3000,2236,"cc1250","5");
      icengine.setModelNUmber("xuv123");
      icengine.setMaxRpm(3000);
      icengine.setMaxPower(2236);
      icengine.setDisplacement("cc1250");
      icengine.setNoOfCylinder("5");
        System.out.println("icengine detail");
        System.out.println(icengine.getModelNUmber());
        System.out.println(icengine.getMaxRpm());
        System.out.println(icengine.getMaxPower());
        System.out.println(icengine.getDisplacement());
        System.out.println(icengine.getNoOfCylinder());

      PetrolEngine petrolEngine= new PetrolEngine("xuv6",1500,2000,"2500","4","petrol");
      petrolEngine.setFuelType("petrol");
      petrolEngine.setModelNUmber("dhgf566");
      petrolEngine.setDisplacement("jfjdf");
      petrolEngine.setMaxPower(53745);
      petrolEngine.setNoOfCylinder("8");
      petrolEngine.setMaxRpm(5000);
        System.out.println("petrol engine detail");
        System.out.println(petrolEngine.getDisplacement());
        System.out.println(petrolEngine.getFuelType());
        System.out.println(petrolEngine.getMaxPower());
        System.out.println(petrolEngine.getMaxRpm());
        System.out.println(petrolEngine.getModelNUmber());
        System.out.println(petrolEngine.getNoOfCylinder());

        ElectricEngine electricEngine = new ElectricEngine("kfhdk123",46475,65856,11000,4);
          electricEngine.setCurrent(55);
          electricEngine.setVoltage(440);
          electricEngine.setMaxPower(76);
          electricEngine.setModelNUmber("hgdhd");
          electricEngine.setMaxRpm(6587);
      System.out.println("Electric engine detail");
      System.out.println(electricEngine.getMaxPower());
      System.out.println(electricEngine.getMaxRpm());
      System.out.println(electricEngine.getModelNUmber());
      System.out.println(electricEngine.getCurrent());
      System.out.println(electricEngine.getVoltage());


    }
}