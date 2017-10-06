package lesson7;

/**
 * Created by Админ on 01.08.2017.
 */
public class Phone {
        int number;
        String  model;
        int weight;

        public Phone(int number, String model, int weight) {
            this();
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone() {
            System.out.println("Телефон создался");
        }

        void receiveCall(String name){
            System.out.println("Звонит" + name );
        }
        int getPhoneNumber(){
            System.out.println("Номер" + number);
            return number;
        }

        void receiveCall (int number, String model){
            System.out.print("Звонит " + number + "" + model);
        }
    }

