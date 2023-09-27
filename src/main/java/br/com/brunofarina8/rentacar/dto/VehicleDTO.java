package br.com.brunofarina8.rentacar.dto;


public class VehicleDTO {

    public VehicleDTO() {
    }

    public VehicleDTO(int id, String modelName, String assembler, int manufactureYear, int modelYear) {
        this.id = id;
        this.modelName = modelName;
        this.assembler = assembler;
        this.manufactureYear = manufactureYear;
        this.modelYear = modelYear;
    }

    private int id;
    private String modelName;
    private String assembler;
    private int manufactureYear;
    private int modelYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getAssembler() {
        return assembler;
    }

    public void setAssembler(String assembler) {
        this.assembler = assembler;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}
