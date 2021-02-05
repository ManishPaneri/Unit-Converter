package converter;

public class LengthConverter {

    private double factor;

    public LengthConverter(String unit){
        if(unit.equalsIgnoreCase("in")){
            factor = UnitConstant.INCH_TO_METER;
        }else if(unit.equalsIgnoreCase("ft")){
            factor = UnitConstant.FOOT_TO_METER;
        }else if (unit.equalsIgnoreCase("mi")){
            factor = UnitConstant.MILE_TO_METER;
        }else if (unit.equalsIgnoreCase("mm")){
            factor = UnitConstant.MM_TO_METER;
        }else if (unit.equalsIgnoreCase("cm")){
            factor = UnitConstant.CM_TO_METER;
        }else if (unit.equalsIgnoreCase("km")){
            factor = UnitConstant.KM_TO_METER;
        }else if (unit.equalsIgnoreCase("yd")){
            factor = UnitConstant.YD_TO_METER;
        }else if (unit.equalsIgnoreCase("m")) {
            factor = UnitConstant.METER_TO_METER;
        }else{
            throw new RuntimeException("Unit not found!");
        }
    }

    public Double toMeter(double measurement){
        return (measurement * factor);
    }

    public Double fromMeter(double measurement){
        return (measurement / factor);
    }


}
