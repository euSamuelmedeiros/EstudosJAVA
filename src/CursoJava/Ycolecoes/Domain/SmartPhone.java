package CursoJava.Ycolecoes.Domain;

public class SmartPhone {
    private String SerialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        SerialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass())
            return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return SerialNumber != null && SerialNumber.equals(smartPhone.SerialNumber);
    }

@Override
public int hashCode(){
    return super.hashCode();
}

    

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
