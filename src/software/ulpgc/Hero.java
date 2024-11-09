    package software.ulpgc;

    import java.time.LocalDate;
    import java.util.List;
    import java.util.ArrayList;

    public class Hero {

        private final String name;
        private final String power;
        private final LocalDate birthday;
        private final String weakness;
        private final int powerLevel;




        public Hero(String name, String power, int powerLevel, String weakness, LocalDate birthday) {
            this.name = name;
            this.power = power;
            this.powerLevel = powerLevel;
            this.weakness = weakness;
            this.birthday = birthday;
        }


        public LocalDate getBirthday() {
            return birthday;
        }

        public int getPowerLevel() {
            return powerLevel;
        }
        public String getPower() {
            return power;
        }
        public String getWeakness() {
            return weakness;
        }
        public String getName() {
            return name;
        }
        public int getAge(){
            return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
        }

        private int toYear(long days) {
            return (int) (days/365);
        }

        @Override
        public String toString() {
            return
                    "Hero='" + name + '\'' +
                    ", power='" + power + '\'' +
                            ", powerLevel=" + powerLevel +
                    ", weakness='" + weakness + '\'' +
                    ", birthday=" + birthday +
                    ", age=" + getAge();
        }
    }

