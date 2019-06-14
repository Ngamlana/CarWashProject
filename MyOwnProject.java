import java.util.Scanner;

public class MyOwnProject {

    public static void main(String[] args) {


        String owner_name;
        String owner_surname;
        String car_name;
        String number_plate;
        String phone_number;
        String google_map;
        String confirm;
        String enteredCharacters;

        String A1 = "Ultimate Wash For Sedan and its cost price is R800.00";
        String A2 = "Ultimate Wash For SUV/Cab and its cost price is R900.00";
        String A3 = "Ultimate Wash For Van/Minibus and its cost price is R1000.00";

        String B1 = "Premium Wash For Sedan and its cost price is R250.00";
        String B2 = "Premium Wash For SUV/Cab and its cost price is R260.00";
        String B3 = "Premium Wash For Van/Minibus and its cost price is R280.00";

        String C1 = "Deluxe Wash For Sedan and its cost price is R140.00";
        String C2 = "Deluxe Wash For SUV/Cab snf its cost price is R150.00";
        String C3 = "Deluxe Wash For Van/Minibus and its cost price is R160.000";


        Scanner user_input = new Scanner(System.in);


        System.out.println();
        System.out.println("******************************");
        System.out.println(" WELCOME TO WASH ME NOW!!! ");
        System.out.println("******************************");
        System.out.println();
        delay(1000);
        System.out.println("This choose what you want to do with this app");
        delay(1000);
        System.out.println();
        System.out.println("Please enter the requested details:");
        System.out.println("___________________________________");
        System.out.println();
        delay(1500);
        System.out.println("Enter your name:");
        owner_name = user_input.nextLine();

        delay(900);

        while (!owner_name.matches("[a-zA-Z,]+") || owner_name.isEmpty()) {
            delay(900);
            System.out.println("Invalid, Please enter your name again: ");
            owner_name = user_input.nextLine();
        }

        delay(1000);
        System.out.println("Enter your surname");
        owner_surname = user_input.nextLine();

        while (!owner_surname.matches("[a-zA-Z,]+") || owner_surname.isEmpty()) {
            System.out.println("Invalid, Please enter your surname again: ");
            owner_surname = user_input.nextLine();
        }

        delay(1000);
        System.out.println("Enter phone number");
        phone_number = user_input.nextLine();


        while (!phone_number.matches("[0-9,]+") || phone_number.isEmpty()) {
            delay(900);
            System.out.println("Invalid! Please enter your number phone again");
            phone_number = user_input.nextLine();
        }

        delay(1000);
        System.out.println("Enter car name");
        car_name = user_input.nextLine();

        while (!car_name.matches("[a-zA-Z,]+") || car_name.isEmpty()) {
            delay(900);
            System.out.println("Invalid, Please enter your car name again: ");
            car_name = user_input.nextLine();
        }
        delay(1000);
        System.out.println("Enter number plate");
        number_plate = user_input.nextLine();

        while (number_plate.isEmpty()) {
            delay(900);
            System.out.println("Invalid, Please enter the number plate again: ");
            number_plate = user_input.nextLine();
        }
        delay(1000);
        System.out.println("Enter your location");
        google_map = user_input.nextLine();

        while (google_map.isEmpty()) {
            delay(900);
            System.out.println("Invalid, Please enter your location again: ");
            google_map = user_input.nextLine();
        }

        delay(1500);

        System.out.println("Thanks " + owner_name + " " + owner_surname + " for entering the requested info.\nThe following are wash services that we have and you have to\nchoose the service you want for your car:");

        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("A. ULTIMATE WASH");
        System.out.println();
        System.out.println("> Double Presoak\n> Undercarriage\n> Tire & Wheel Blaster\n> Tire Shine\n> Spot Free Rinse\n> Turbo Air Dry\n> Towel Dry  ");
        System.out.println();
        System.out.println("Prices: ");
        System.out.println();
        System.out.println("A1. Ultimate Wash Price For Sedan -> R800.00\nA2. Ultimate Wash Price For SUV & Cab -> R900.00\nA3. Ultimate Wash Price For Van & Minibus -> R1000.00");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("B. PREMIUM WASH");
        System.out.println();
        System.out.println("> Double Presoak\n> Undercarriage\n> Triple Foam Wax\n> Tire & Wheel Blaster\n> Tire Shine\n> Spot Free Rinse\n> Towel & Dry Windows");
        System.out.println();
        System.out.println("Prices: ");
        System.out.println();
        System.out.println("B1. Premium Wash Price For Sedan -> R250.00\nB2. Premium Wash Price For SUV & Cab -> R260.00\nB3. Premium Wash Price For Van & Minibus -> R280.00");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("C. DELUXE WASH");
        System.out.println();
        System.out.println("> Double Presoak\n> Undercarriage\n> Triple Foam Wax\n> Spot Free Rinse\n> Turbo Air Dry");
        System.out.println();
        System.out.println("Prices: ");
        System.out.println();
        System.out.println("C1. Deluxe Wash Price For Sedan -> R140.00\nC2. Deluxe Wash Price For SUV & Cab -> R150.00\nC3. Deluxe Wash Price For Van & Minibus -> R160.00");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Please choose by entering the letter and the number that is next to the car type, eg(B1): ");

        enteredCharacters = user_input.nextLine();

        while (enteredCharacters.isEmpty()) {
            System.out.println("Invalid!, Please enter what is required");
            enteredCharacters = user_input.nextLine();

        }
        delay(1900);

        System.out.println("Mr/Mrs/Miss " + owner_surname + " this is the info that you gave to us, check if it's correct: ");
        System.out.println();
        System.out.println("Your name is: " + owner_name);
        System.out.println("Your surname is: " + owner_surname);
        System.out.println("Your phone number is: " + phone_number);
        System.out.println("Number plate of your car: " + number_plate);
        System.out.println("Name of your car: " + car_name);
        System.out.println("Car location: " + google_map);

        if (enteredCharacters.equals("A1") || enteredCharacters.equals("a1")) {
            System.out.println("Chosen wash for your car is " + A1);
        } else if (enteredCharacters.equals("A2") || enteredCharacters.equals("a2")) {
            System.out.println("Chosen wash for your car is " + A2);
        } else if (enteredCharacters.equals("A3") || enteredCharacters.equals("a3")) {
            System.out.println("Chosen wash for your car is " + A3);
        } else if (enteredCharacters.equals("B1") || enteredCharacters.equals("b1")) {
            System.out.println("Chosen wash for your car is " + B1);
        } else if (enteredCharacters.equals("B2") || enteredCharacters.equals("b2")) {
            System.out.println("Chosen wash for your car is " + B2);
        } else if (enteredCharacters.equals("B3") || enteredCharacters.equals("b3")) {
            System.out.println("Chosen wash for your car is " + B3);
        } else if (enteredCharacters.equals("C1") || enteredCharacters.equals("c1")) {
            System.out.println("Chosen wash for your car is " + C1);
        } else if (enteredCharacters.equals("C2") || enteredCharacters.equals("c2")) {
            System.out.println("Chosen wash for your car is " + C2);
        } else if (enteredCharacters.equals("C3") || enteredCharacters.equals("c3")) {
            System.out.println("Chosen wash for your car is " + C3);
        }

        System.out.println();
        System.out.println("_____________________________________________________________________________________________");
        System.out.println();
        System.out.println("To confirm enter (Y), Cancel or go back to the home page enter (N)");
        System.out.println("_____________________________________________________________________________________________");

        confirm = user_input.nextLine();
        if (confirm.equals("Y") || confirm.equals("y")) {
            System.out.println("Confirmed! Thank you " + owner_name + " " + owner_surname + ", your " + car_name + " will be clean as soon as we get there.\nEnter 'H' to go back to the home page");
            confirm = user_input.nextLine();

            while (confirm.isEmpty()) {
                System.out.println("Enter what is requested");
                confirm = user_input.nextLine();
            }

        }
        while (confirm.equals("N") || confirm.equals("n")) {
            System.out.println("Request Cancelled. Enter 'H' to go back to the hom page");
            confirm = user_input.nextLine();

            while (confirm.isEmpty()) {
                System.out.println("Enter what is requested");
                confirm = user_input.nextLine();
            }
            break;

        }
        while (confirm.equals("H") || confirm.equals("h")) {

            System.out.println();
            System.out.println("******************************");
            System.out.println(" WELCOME TO WASH ME NOW!!! ");
            System.out.println("******************************");
            System.out.println();
            System.out.println("Please enter the requested details:");
            System.out.println("___________________________________");
            System.out.println();

            System.out.println("Enter your name:");
            owner_name = user_input.nextLine();

            while (!owner_name.matches("[a-zA-Z,]+") || owner_name.isEmpty()) {
                System.out.println("Invalid, Please enter your name again: ");
                owner_name = user_input.nextLine();

            }

            System.out.println("Enter your surname");
            owner_surname = user_input.nextLine();

            while (!owner_surname.matches("[a-zA-Z,]+") || owner_surname.isEmpty()) {
                System.out.println("Invalid, Please enter your surname again: ");
                owner_surname = user_input.nextLine();
            }

            System.out.println("Enter phone number");
            phone_number = user_input.nextLine();


            while (!phone_number.matches("[0-9,]+") || phone_number.isEmpty()) {
                System.out.println("Invalid! Please enter your number phone again");
                phone_number = user_input.nextLine();
            }


            System.out.println("Enter car name");
            car_name = user_input.nextLine();

            while (!car_name.matches("[a-zA-Z,]+") || car_name.isEmpty()) {
                System.out.println("Invalid, Please enter your car name again: ");
                car_name = user_input.nextLine();
            }

            System.out.println("Enter number plate");
            number_plate = user_input.nextLine();

            while (number_plate.isEmpty()) {
                System.out.println("Invalid, Please enter the number plate again: ");
                number_plate = user_input.nextLine();
            }

            System.out.println("Enter your location");
            google_map = user_input.nextLine();

            while (google_map.isEmpty()) {
                System.out.println("Invalid, Please enter your location again: ");
                google_map = user_input.nextLine();
            }
            System.out.println("Thanks " + owner_name + " " + owner_surname + " for entering the requested info.\nThe following are wash services that we have and you have to choose the service you want for your car:");

            System.out.println("_____________________________________________________________________________________________");
            System.out.println();
            System.out.println("A. ULTIMATE WASH");
            System.out.println();
            System.out.println("> Double Presoak\n> Undercarriage\n> Tire & Wheel Blaster\n> Tire Shine\n> Spot Free Rinse\n> Turbo Air Dry\n> Towel Dry  ");
            System.out.println();
            System.out.println("Prices: ");
            System.out.println();
            System.out.println("A1. Ultimate Wash Price For Sedan -> R800.00\nA2. Ultimate Wash Price For SUV & Cab -> R900.00\nA3. Ultimate Wash Price For Van & Minibus -> R1000.00");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------");

            System.out.println();
            System.out.println("B. PREMIUM WASH");
            System.out.println();
            System.out.println("> Double Presoak\n> Undercarriage\n> Triple Foam Wax\n> Tire & Wheel Blaster\n> Tire Shine\n> Spot Free Rinse\n> Towel & Dry Windows");
            System.out.println();
            System.out.println("Prices: ");
            System.out.println();
            System.out.println("B1. Premium Wash Price For Sedan -> R250.00\nB2. Premium Wash Price For SUV & Cab -> R260.00\nB3. Premium Wash Price For Van & Minibus -> R280.00");
            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------");

            System.out.println();
            System.out.println("C. DELUXE WASH");
            System.out.println();
            System.out.println("> Double Presoak\n> Undercarriage\n> Triple Foam Wax\n> Spot Free Rinse\n> Turbo Air Dry");
            System.out.println();
            System.out.println("Prices: ");
            System.out.println();
            System.out.println("C1. Deluxe Wash Price For Sedan -> R140.00\nC2. Deluxe Wash Price For SUV & Cab -> R150.00\nC3. Deluxe Wash Price For Van & Minibus -> R160.00");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Please choose by entering the letter and the number that is next to the car type, eg(B1): ");

            enteredCharacters = user_input.nextLine();

            System.out.println("Your name is: " + owner_name);
            System.out.println("Your surname is: " + owner_surname);
            System.out.println("Your phone number is: " + phone_number);
            System.out.println("Number plate of your car: " + number_plate);
            System.out.println("Name of your car: " + car_name);
            System.out.println("Car location: " + google_map);

            if (enteredCharacters.equals("A1") || enteredCharacters.equals("a1")) {
                System.out.println("Chosen wash for your car is " + A1);
            } else if (enteredCharacters.equals("A2") || enteredCharacters.equals("a2")) {
                System.out.println("Chosen wash for your car is " + A2);
            } else if (enteredCharacters.equals("A3") || enteredCharacters.equals("a3")) {
                System.out.println("Chosen wash for your car is " + A3);
            } else if (enteredCharacters.equals("B1") || enteredCharacters.equals("b1")) {
                System.out.println("Chosen wash for your car is " + B1);
            } else if (enteredCharacters.equals("B2") || enteredCharacters.equals("b2")) {
                System.out.println("Chosen wash for your car is " + B2);
            } else if (enteredCharacters.equals("B3") || enteredCharacters.equals("b3")) {
                System.out.println("Chosen wash for your car is " + B3);
            } else if (enteredCharacters.equals("C1") || enteredCharacters.equals("c1")) {
                System.out.println("Chosen wash for your car is " + C1);
            } else if (enteredCharacters.equals("C2") || enteredCharacters.equals("c2")) {
                System.out.println("Chosen wash for your car is " + C2);
            } else if (enteredCharacters.equals("C3") || enteredCharacters.equals("c3")) {
                System.out.println("Chosen wash for your car is " + C3);
            }

            System.out.println();
            System.out.println("_________________________________________________________________________________________");
            System.out.println();
            System.out.println("To confirm enter (Y), Cancel or go back to the home page enter (N)");
            System.out.println("_________________________________________________________________________________________");

            confirm = user_input.nextLine();
            if (confirm.equals("Y") || confirm.equals("y")) {
                System.out.println("Confirmed! Thank you " + owner_name + " " + owner_surname + ", your " + car_name + " will be clean as soon as we get there.\nEnter 'H' to go back to the home page");
                confirm = user_input.nextLine();

            }
            while (confirm.equals("N") || confirm.equals("n")) {
                System.out.println("Request Cancelled. Enter 'H' to go back to the home page");
                confirm = user_input.nextLine();


            }

        }


    }

    private static void delay(int ms){

        try {
            Thread.sleep(50 + ms);
        }catch (Exception e){


        }
    }
}



