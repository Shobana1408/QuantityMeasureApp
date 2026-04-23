package com.apps.quantitymeasurement;
class QuantityMeasurementApp{
  public static class Feet{
    private final double value;
    public Feet(double value){
      this.value = value;
    }
    @Override
    public boolean equals(Object obj){
      if (this == obj){
        return true;
      }
      if (obj == null || getClass() != obj.getClass()){
        return false;
      }
      Feet feet = (Feet) obj;
      return Double.compare(this.value, feet.value)==0;
    }
  }
  public static void main(String[] args){
    Feet value1 = new Feet(1.0);
    Feet value2 = new Feet(1.0);
    Feet value3 = new Feet(2.0);
    System.out.println(value1.equals(value2));
    System.out.println(value1.equals(value3));
    System.out.println(value1.equals(null));
    System.out.println(value1.equals("1.0"));
    System.out.println(value1.equals(value1));
  }
}
