package liveClass;

public class At extends Hayvan{
    public At(boolean koşabiliyormu) {
        super(koşabiliyormu);
    }

    public At() {
        super();
    }
    @Override
    public String toString(){
        return "Ben bir atım";
    }
}
