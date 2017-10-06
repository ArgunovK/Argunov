package Lesson12;

/**
 * Created by Админ on 25.09.2017.
 */
public enum  Season {
    SPRING(15), SUMMER(30){
        @Override
        public String getDescription() {
            return super.getDescription();
        }
    }, AUTUMN(15), WINTER(-20);

    Season(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года:";
    }
}
